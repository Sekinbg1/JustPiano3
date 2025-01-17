package ly.pp.justpiano3.task;

import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.widget.Toast;

import java.lang.ref.WeakReference;

import ly.pp.justpiano3.BuildConfig;
import ly.pp.justpiano3.activity.online.OLBaseActivity;
import ly.pp.justpiano3.activity.online.UsersInfo;
import ly.pp.justpiano3.utils.OkHttpUtil;
import okhttp3.FormBody;

public final class UserInfoChangeTask extends AsyncTask<String, Void, String> {
    private final WeakReference<UsersInfo> usersInfo;

    public UserInfoChangeTask(UsersInfo usersInfo) {
        this.usersInfo = new WeakReference<>(usersInfo);
    }

    @Override
    protected String doInBackground(String... strArr) {
        FormBody.Builder bodyBuilder = new FormBody.Builder()
                .add("head", "0")
                .add("version", BuildConfig.VERSION_NAME)
                .add("keywords", strArr[0])
                .add("userName", OLBaseActivity.getAccountName());
        if (strArr[1] == null || strArr[2] == null) {
            bodyBuilder.add("msg", usersInfo.get().signature)
                    .add("age", String.valueOf(usersInfo.get().age));
        } else {
            bodyBuilder.add("oldPass", strArr[1]).add("newPass", strArr[2]);
        }
        return OkHttpUtil.sendPostRequest("ChangeUserMsg", bodyBuilder.build());
    }

    @Override
    protected void onPostExecute(String str) {
        switch (str) {
            case "0" -> {
                usersInfo.get().jpprogressBar.cancel();
                Toast.makeText(usersInfo.get(), "资料修改成功!", Toast.LENGTH_LONG).show();
            }
            case "4" -> {
                usersInfo.get().jpprogressBar.cancel();
                Toast.makeText(usersInfo.get(), "密码中含有无法识别的特殊符号!", Toast.LENGTH_SHORT).show();
            }
            case "5" -> {
                usersInfo.get().jpprogressBar.cancel();
                Toast.makeText(usersInfo.get(), "原密码有错!请再试一遍", Toast.LENGTH_SHORT).show();
            }
            case "6" -> {
                usersInfo.get().jpprogressBar.cancel();
                Toast.makeText(usersInfo.get(), "密码修改成功!", Toast.LENGTH_LONG).show();
                Editor edit = OLBaseActivity.accountListSharedPreferences.edit();
                if (usersInfo.get().rememberNewPassword) {
                    edit.putString("name", OLBaseActivity.getAccountName());
                    edit.putString("password", "");
                    edit.putString("current_password", null);
                    edit.putBoolean("chec_psw", usersInfo.get().rememberNewPassword);
                    edit.putBoolean("chec_autologin", usersInfo.get().autoLogin);
                } else {
                    edit.putString("password", "");
                    edit.putString("current_password", null);
                    edit.putBoolean("chec_psw", usersInfo.get().rememberNewPassword);
                    edit.putBoolean("chec_autologin", usersInfo.get().rememberNewPassword);
                }
                edit.apply();
                OLBaseActivity.returnMainMode(usersInfo.get());
            }
            default -> {
                usersInfo.get().jpprogressBar.cancel();
                Toast.makeText(usersInfo.get(), "连接有错，请尝试重新登录", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onPreExecute() {
        usersInfo.get().jpprogressBar.setCancelable(true);
        usersInfo.get().jpprogressBar.setOnCancelListener(dialog -> cancel(true));
        usersInfo.get().jpprogressBar.show();
    }
}
