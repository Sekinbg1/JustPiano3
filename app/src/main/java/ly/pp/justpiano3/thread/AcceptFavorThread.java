package ly.pp.justpiano3.thread;

import java.io.IOException;

import io.netty.util.internal.StringUtil;
import ly.pp.justpiano3.BuildConfig;
import ly.pp.justpiano3.utils.OkHttpUtil;
import ly.pp.justpiano3.utils.OnlineUtil;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public final class AcceptFavorThread extends Thread {
    private final String type;
    private final String songID;
    private final String userName;

    public AcceptFavorThread(String l, String str, String str2) {
        songID = l;
        userName = str2;
        type = str;
    }

    @Override
    public void run() {
        if (!StringUtil.isNullOrEmpty(userName)) {
            String url = "http://" + OnlineUtil.server + ":8910/JustPianoServer/server/AcceptFavorIn";

            FormBody.Builder formBuilder = new FormBody.Builder();
            formBuilder.add("version", BuildConfig.VERSION_NAME);
            formBuilder.add("type", type);
            formBuilder.add("songID", songID);
            formBuilder.add("user", userName);
            RequestBody requestBody = formBuilder.build();

            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .build();
            try {
                OkHttpUtil.client().newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
