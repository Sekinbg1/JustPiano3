package ly.pp.justpiano3.task;

import android.os.AsyncTask;

import java.io.IOException;
import java.lang.ref.WeakReference;

import ly.pp.justpiano3.BuildConfig;
import ly.pp.justpiano3.activity.online.OLPlayHallRoom;
import ly.pp.justpiano3.utils.OkHttpUtil;
import ly.pp.justpiano3.utils.OnlineUtil;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.Response;

public final class OLPlayHallRoomTask extends AsyncTask<String, Void, String> {
    private final WeakReference<OLPlayHallRoom> olPlayHallRoom;

    public OLPlayHallRoomTask(OLPlayHallRoom olPlayHallRoom) {
        this.olPlayHallRoom = new WeakReference<>(olPlayHallRoom);
    }

    @Override
    protected String doInBackground(String... strArr) {
        Request request = new Request.Builder()
                .url("http://" + OnlineUtil.server + ":8910/JustPianoServer/server/GetUserInfo")
                .post(new FormBody.Builder()
                        .add("head", "2")
                        .add("version", BuildConfig.VERSION_NAME)
                        .add("keywords", strArr[0])
                        .build())
                .build();
        String str = "";
        try {
            Response response = OkHttpUtil.client().newCall(request).execute();
            if (response.isSuccessful()) {
                str = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    @Override
    protected void onPostExecute(String str) {
        // TODO 响应str有什么用？能否判断结果成功还是失败
        olPlayHallRoom.get().jpprogressBar.cancel();
    }

    @Override
    protected void onPreExecute() {
        olPlayHallRoom.get().jpprogressBar.setCancelable(true);
        olPlayHallRoom.get().jpprogressBar.setOnCancelListener(dialog -> cancel(true));
        olPlayHallRoom.get().jpprogressBar.show();
    }
}
