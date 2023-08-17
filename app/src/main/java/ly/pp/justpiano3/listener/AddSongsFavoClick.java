package ly.pp.justpiano3.listener;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import ly.pp.justpiano3.adapter.LocalSongsAdapter;

public final class AddSongsFavoClick implements OnClickListener {
    private final LocalSongsAdapter localSongsAdapter;
    private final Cursor cursor;
    private final Context context;
    private final String songsPath;
    private final String songsName;

    public AddSongsFavoClick(LocalSongsAdapter localSongsAdapter, Cursor cursor, Context context) {
        this.localSongsAdapter = localSongsAdapter;
        this.cursor = cursor;
        this.context = context;
        songsPath = cursor.getString(cursor.getColumnIndexOrThrow("path"));
        songsName = cursor.getString(cursor.getColumnIndexOrThrow("name"));
    }

    public void onClick(View view) {
        int i = 0;
        ContentValues contentValues = new ContentValues();
        try {
            int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("isfavo"));
            if (i2 == 0) {
                i = 1;
            } else if (i2 != 1) {
                i = i2;
            }
            contentValues.put("isfavo", i);
            localSongsAdapter.melodyselect.sqlitedatabase.update("jp_data", contentValues, "path = '" + songsPath + "'", null);
            String str = "";
            switch (i) {
                case 0:
                    str = ":已移出收藏夹";
                    break;
                case 1:
                    str = ":已加入收藏夹";
                    break;
            }
            Toast.makeText(context, songsName + str, Toast.LENGTH_SHORT).show();
            LocalSongsAdapter.m3966a(localSongsAdapter, localSongsAdapter.melodyselect.f4264t);
            contentValues.clear();
        } catch (Exception ignored) {
        }
    }
}