package ly.pp.justpiano3;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.OutputStream;

public class OLMainMode extends BaseActivity implements OnClickListener {
    final OLMainMode context = this;
    public JPApplication jpapplication;
    public OutputStream outputStream;
    OLMainModeHandler olMainModeHandler = new OLMainModeHandler(this);

    @Override
    public void onBackPressed() {
        if (jpprogressBar != null) {
            jpprogressBar.dismiss();
        }
        Intent intent = new Intent();
        intent.putExtra("no_auto", true);
        intent.setClass(this, Login.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.ol_ance_b:
                JPDialog jpdialog = new JPDialog(this);
                jpdialog.setTitle("提示");
                jpdialog.setMessage("官网访问方式：在浏览器中输入网址https://i.justpiano.fun\n" +
                        "官网功能包括最新极品钢琴软件下载、通知公告、曲谱上传、皮肤音源上传、族徽上传、问题反馈等");
                jpdialog.setFirstButton("访问官网", (dialog, which) -> {
                    dialog.dismiss();
                    Intent intent1 = new Intent(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://i.justpiano.fun"));
                    startActivity(intent1);
                });
                jpdialog.setSecondButton("取消", new DialogDismissClick());
                jpdialog.showDialog();
                return;
            case R.id.ol_songs_b:
                intent.setClass(this, OLSongsPage.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_playhall_b:
                if (jpapplication.getAccountName().isEmpty()) {
                    Toast.makeText(context, "您已经掉线请返回重新登陆!", Toast.LENGTH_SHORT).show();
                    return;
                }
                TestSQL testSQL = new TestSQL(this, "data");
                String maxSongIdFromDatabase = getMaxSongIdFromDatabase(testSQL);
                testSQL.close();
                new SongSyncDialogTask(this, maxSongIdFromDatabase).execute();
                return;
            case R.id.ol_top_b:
                intent.setClass(this, OLTopUser.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_users_b:
                intent.putExtra("head", 0);
                intent.setClass(this, UsersInfo.class);
                startActivity(intent);
                finish();
                return;
            case R.id.ol_bindmail_b:
                Toast.makeText(this, "此版本不支持绑定邮箱!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.ol_finduser_b:
                intent.putExtra("head", 6);
                intent.setClass(this, SearchSongs.class);
                startActivity(intent);
                finish();
                return;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityNum = 0;
        jpapplication = (JPApplication) getApplication();
        jpprogressBar = new JPProgressBar(this, jpapplication);
        jpapplication.loadSettings(true);
        setContentView(R.layout.olmainmode);
        jpapplication.setBackGround(this, "ground", findViewById(R.id.layout));
        JPApplication jPApplication = jpapplication;
        jPApplication.setGameMode(0);
        Button f4285k = findViewById(R.id.ol_top_b);
        f4285k.setOnClickListener(this);
        Button f4286l = findViewById(R.id.ol_users_b);
        f4286l.setOnClickListener(this);
        Button f4288n = findViewById(R.id.ol_playhall_b);
        f4288n.setOnClickListener(this);
        Button f4287m = findViewById(R.id.ol_songs_b);
        f4287m.setOnClickListener(this);
        Button f4289o = findViewById(R.id.ol_ance_b);
        f4289o.setOnClickListener(this);
        f4289o.setVisibility(View.VISIBLE);
        Button f4290p = findViewById(R.id.ol_bindmail_b);
        f4290p.setOnClickListener(this);
        Button f4291q = findViewById(R.id.ol_finduser_b);
        f4291q.setOnClickListener(this);
        try {
            if (jpapplication.getConnectionService() != null) {
                jpapplication.getConnectionService().outLine();
            }
            if (jpapplication.getIsBindService()) {
                jpapplication.unbindService(jpapplication.mo2696L());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JPStack.create();
        JPStack.push(this);
        if (jpapplication.f4073g != null && jpapplication.f4074h != null && !jpapplication.f4073g.isEmpty() && !jpapplication.f4074h.isEmpty()) {
            JPDialog jpdialog = new JPDialog(this);
            jpdialog.setTitle(jpapplication.f4073g);
            jpdialog.setMessage(jpapplication.f4074h);
            jpdialog.setFirstButton("确定", (dialog, which) -> {
                jpapplication.f4074h = "";
                jpapplication.f4073g = "";
                dialog.dismiss();
            });
            jpdialog.showDialog();
        }
    }

    @Override
    protected void onDestroy() {
        JPStack.create();
        JPStack.pop(this);
        super.onDestroy();
    }

    public void loginOnline() {
        jpprogressBar.show();
        if (jpapplication.getIsBindService()) {
            try {
                jpapplication.unbindService(jpapplication.mo2696L());
            } catch (Exception e) {
                e.printStackTrace();
            }
            jpapplication.setIsBindService(jpapplication.bindService(new Intent(this, ConnectionService.class), jpapplication.mo2696L(), Context.BIND_AUTO_CREATE));
        } else {
            jpapplication.setIsBindService(jpapplication.bindService(new Intent(this, ConnectionService.class), jpapplication.mo2696L(), Context.BIND_AUTO_CREATE));
        }
    }

    public static String getMaxSongIdFromDatabase(TestSQL testSQL) {
        SQLiteDatabase writableDatabase = testSQL.getWritableDatabase();
        Cursor query = writableDatabase.query("jp_data", new String[]{"online", "path"}, "online=1", null, null, null, null);
        int maxSongId = 0;
        while (query.moveToNext()) {
            String path = query.getString(query.getColumnIndex("path"));
            if (path.length() > 8 && path.charAt(7) == '/') {
                maxSongId = Math.max(maxSongId, Integer.parseInt(path.substring(9, 15)));
            }
        }
        query.close();
        writableDatabase.close();
        return String.valueOf(maxSongId);
    }
}
