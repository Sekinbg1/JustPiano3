package ly.pp.justpiano3.task;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import io.netty.util.internal.StringUtil;
import ly.pp.justpiano3.BuildConfig;
import ly.pp.justpiano3.JPApplication;
import ly.pp.justpiano3.thread.ThreadPoolUtils;
import ly.pp.justpiano3.utils.OkHttpUtil;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public final class FeedbackTask {
    private final Context context;
    private final String userName;
    private final String message;

    public FeedbackTask(Context context, String userName, String message) {
        this.context = context;
        this.userName = userName;
        this.message = message;
    }

    public void execute() {
        JPApplication jpApplication = (JPApplication) context.getApplicationContext();
        String url = "http://" + jpApplication.getServer() + ":8910/JustPianoServer/server/Feedback";
        FormBody.Builder formBuilder = new FormBody.Builder();
        formBuilder.add("version", BuildConfig.VERSION_NAME);
        formBuilder.add("userName", userName);
        formBuilder.add("message", message);
        RequestBody requestBody = formBuilder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        ThreadPoolUtils.execute(() -> {
            try (Response response = OkHttpUtil.client().newCall(request).execute()) {
                if (response.isSuccessful()) {
                    String responseStr = response.body().string();
                    if (context instanceof Activity) {
                        ((Activity) context).runOnUiThread(() -> Toast.makeText(context,
                                StringUtil.isNullOrEmpty(responseStr) ? "反馈提交出错" : "反馈提交成功", Toast.LENGTH_SHORT).show());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
