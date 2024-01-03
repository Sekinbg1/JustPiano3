package ly.pp.justpiano3.listener;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

import androidx.preference.PreferenceManager;

import java.io.File;

import ly.pp.justpiano3.activity.local.SkinDownload;
import ly.pp.justpiano3.utils.ImageLoadUtil;
import ly.pp.justpiano3.utils.ThreadPoolUtil;

public final class SkinDownloadClick implements OnClickListener {
    private final SkinDownload skinDownload;
    private final int type;
    private final String url;
    private final String name;

    public SkinDownloadClick(SkinDownload skinDownload, int i, String str, String str2) {
        this.skinDownload = skinDownload;
        type = i;
        url = str;
        name = str2;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        dialogInterface.dismiss();
        switch (type) {
            case 0 -> ThreadPoolUtil.execute(() -> skinDownload.downloadSkin(url, name));
            case 1 -> ThreadPoolUtil.execute(() -> skinDownload.changeSkin(name + ".ps"));
            case 2 -> {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(skinDownload).edit();
                edit.putString("skin_select", "original");
                edit.apply();
                File dir = new File(skinDownload.getFilesDir(), "Skins");
                if (dir.isDirectory()) {
                    File[] listFiles = dir.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            file.delete();
                        }
                    }
                }
                ImageLoadUtil.setBackground(skinDownload);
            }
        }
    }
}
