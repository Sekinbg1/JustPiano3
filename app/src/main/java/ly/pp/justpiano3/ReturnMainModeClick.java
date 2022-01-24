package ly.pp.justpiano3;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ReturnMainModeClick implements OnClickListener {

    private final BaseActivity baseactivity;

    ReturnMainModeClick(BaseActivity baseActivity) {
        baseactivity = baseActivity;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (baseactivity.activityNum > 0) {
            if (baseactivity instanceof OLPlayRoom) {
                OLPlayRoom olPlayRoom = (OLPlayRoom) baseactivity;
                if (olPlayRoom.playSongs != null) {
                    olPlayRoom.playSongs.isPlayingSongs = false;
                    olPlayRoom.playSongs = null;
                }
            }
            BaseActivity.returnMainMode(baseactivity);
        }
    }
}
