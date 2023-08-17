package ly.pp.justpiano3.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import ly.pp.justpiano3.*;
import ly.pp.justpiano3.adapter.ShowSongsInfoAdapter;
import ly.pp.justpiano3.task.ShowSongsInfoTask;
import ly.pp.justpiano3.utils.GZIPUtil;
import ly.pp.justpiano3.view.JPProgressBar;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShowSongsInfo extends Activity implements OnClickListener {
    public JPApplication jpapplication;
    public LayoutInflater layoutInflater;
    public String keywords = "";
    public String songName = "";
    public String songID;
    public ListView songsListView;
    public JPProgressBar jpprogressBar;
    public double nandu;
    public int score;
    public String head = "1";
    public int page;
    private TextView pageText;
    private ShowSongsInfoAdapter showSongsInfoAdapter;
    private List<HashMap> songsList;

    private List<HashMap> m3857a(String str) {
        JSONArray jSONArray;
        List<HashMap> arrayList = new ArrayList<>();
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("songID", jSONArray.getJSONObject(i).get("SI").toString());
                hashMap.put("songName", jSONArray.getJSONObject(i).get("SN").toString());
                hashMap.put("degree", Double.valueOf(jSONArray.getJSONObject(i).get("DG").toString()));
                hashMap.put("items", jSONArray.getJSONObject(i).get("AR").toString());
                hashMap.put("topUser", jSONArray.getJSONObject(i).get("TU").toString());
                hashMap.put("topScore", jSONArray.getJSONObject(i).get("TS").toString());
                hashMap.put("playCount", Integer.valueOf(jSONArray.getJSONObject(i).get("PC").toString()));
                hashMap.put("length", jSONArray.getJSONObject(i).get("LE").toString());
                hashMap.put("update", jSONArray.getJSONObject(i).get("UP").toString());
                arrayList.add(hashMap);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public final void mo2976a(int i) {
        if (showSongsInfoAdapter != null && songsList != null) {
            songsList.remove(i);
            showSongsInfoAdapter.mo3500a(songsList);
            showSongsInfoAdapter.notifyDataSetChanged();
        }
    }

    public final void mo2977a(String str, ListView listView) {
        try {
            songsList = m3857a(GZIPUtil.ZIPTo(new JSONObject(str).getString("L")));
            showSongsInfoAdapter = new ShowSongsInfoAdapter(this, songsList);
            if (listView != null) {
                listView.setAdapter(showSongsInfoAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        if (jpprogressBar != null) {
            jpprogressBar.dismiss();
        }
        Intent intent = new Intent();
        intent.setClass(this, OLSongsPage.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View view) {
        if (keywords.equals("H") || keywords.equals("N") || keywords.equals("T") || keywords.equals("M")) {
            switch (view.getId()) {
                case R.id.ol_top_next:
                    page++;
                    break;
                case R.id.ol_top_before:
                    page--;
                    if (page < 0) {
                        page = 0;
                    }
                    break;
            }
            pageText.setText("-" + (page + 1) + "-");
            new ShowSongsInfoTask(this).execute();
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jpapplication = (JPApplication) getApplication();
        Bundle extras = getIntent().getExtras();
        head = extras.getString("head");
        keywords = extras.getString("keywords");
        setContentView(R.layout.showtopinfo);
        jpapplication.setBackGround(this, "ground", findViewById(R.id.layout));
        layoutInflater = LayoutInflater.from(this);
        TextView f4974j = findViewById(R.id.ol_top_title);
        Button f4976l = findViewById(R.id.ol_top_before);
        Button f4977m = findViewById(R.id.ol_top_next);
        f4976l.setOnClickListener(this);
        f4977m.setOnClickListener(this);
        pageText = findViewById(R.id.ol_top_page);
        pageText.setText("-" + (page + 1) + "-");
        songsListView = findViewById(R.id.ol_top_list);
        jpprogressBar = new JPProgressBar(this);
        switch (keywords) {
            case "N":
                f4974j.setText("-最新曲目-");
                break;
            case "H":
                f4974j.setText("-热门曲目-");
                break;
            case "F":
                f4974j.setText("-曲谱收藏-");
                break;
            case "T":
                f4974j.setText("-新晋冠军-");
                songsListView.setCacheColorHint(0);
                break;
            case "M":
                f4974j.setText("-上传测试-");
                break;
        }
        new ShowSongsInfoTask(this).execute();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }
}