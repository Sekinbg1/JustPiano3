package ly.pp.justpiano3.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.List;

import ly.pp.justpiano3.R;
import ly.pp.justpiano3.activity.OLPlayKeyboardRoom;
import ly.pp.justpiano3.utils.GZIPUtil;
import ly.pp.justpiano3.utils.ImageLoadUtil;
import ly.pp.justpiano3.utils.ThreadPoolUtil;
import ly.pp.justpiano3.view.JPDialogBuilder;

public final class SimpleSkinListAdapter extends BaseAdapter {
    private final OLPlayKeyboardRoom olPlayKeyboardRoom;
    private final List<String> list;
    private final List<File> fileList;
    private final LayoutInflater layoutInflater;
    private final JPDialogBuilder.JPDialog dialog;

    public SimpleSkinListAdapter(List<String> list, List<File> file, LayoutInflater layoutInflater, OLPlayKeyboardRoom olPlayKeyboardRoom, JPDialogBuilder.JPDialog dialog) {
        this.list = list;
        this.fileList = file;
        this.layoutInflater = layoutInflater;
        this.olPlayKeyboardRoom = olPlayKeyboardRoom;
        this.dialog = dialog;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.account_name, null);
        }
        String name = list.get(index);
        TextView nameView = view.findViewById(R.id.account_name_text);
        nameView.setText(name);
        nameView.setOnClickListener(v -> {
            dialog.dismiss();
            olPlayKeyboardRoom.jpProgressBar.show();
            olPlayKeyboardRoom.jpProgressBar.setCancelable(false);
            ThreadPoolUtil.execute(() -> {
                File dir = olPlayKeyboardRoom.getDir("Skin", Context.MODE_PRIVATE);
                if (dir.isDirectory()) {
                    File[] listFiles = dir.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        for (File delete : listFiles) {
                            delete.delete();
                        }
                    }
                }
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(olPlayKeyboardRoom).edit();
                if (name.equals("默认皮肤")) {
                    edit.putString("skin_list", "original");
                } else {
                    edit.putString("skin_list", Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + fileList.get(index - 1).getName());
                    GZIPUtil.ZIPFileTo(new File(Environment.getExternalStorageDirectory() + "/JustPiano/Skins/" + fileList.get(index - 1).getName()), dir.toString());
                }
                edit.apply();
                olPlayKeyboardRoom.runOnUiThread(() -> {
                    olPlayKeyboardRoom.keyboardView.changeSkinKeyboardImage(olPlayKeyboardRoom);
                    ImageLoadUtil.setBackground(olPlayKeyboardRoom, "ground", olPlayKeyboardRoom.findViewById(R.id.layout));
                    olPlayKeyboardRoom.jpProgressBar.dismiss();
                    Toast.makeText(olPlayKeyboardRoom, "皮肤设置成功", Toast.LENGTH_SHORT).show();
                });
            });
        });
        Button delete = view.findViewById(R.id.account_delete);
        delete.setVisibility(View.GONE);
        return view;
    }
}
