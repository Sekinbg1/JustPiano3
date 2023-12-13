package ly.pp.justpiano3.activity;

import android.os.Bundle;

import androidx.activity.ComponentActivity;

import ly.pp.justpiano3.entity.GlobalSetting;
import ly.pp.justpiano3.utils.ImageLoadUtil;
import ly.pp.justpiano3.utils.WindowUtil;

public class BaseActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageLoadUtil.setBackground(this);
        if (GlobalSetting.INSTANCE.getAllFullScreenShow()) {
            WindowUtil.fullScreenHandle(getWindow());
        } else {
            WindowUtil.exitFullScreenHandle(getWindow());
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            if (GlobalSetting.INSTANCE.getAllFullScreenShow()) {
                WindowUtil.fullScreenHandle(getWindow());
            } else {
                WindowUtil.exitFullScreenHandle(getWindow());
            }
        }
    }
}
