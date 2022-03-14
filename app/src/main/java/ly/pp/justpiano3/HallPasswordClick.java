package ly.pp.justpiano3;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

import ly.pp.justpiano3.protobuf.dto.OnlineEnterHallDTO;

final class HallPasswordClick implements OnClickListener {
    private final MainGameAdapter mainGameAdapter;
    private final TextView textView;
    private final byte f5274c;

    HallPasswordClick(MainGameAdapter mainGameAdapter, TextView textView, byte b) {
        this.mainGameAdapter = mainGameAdapter;
        this.textView = textView;
        f5274c = b;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(textView.getText());
        OnlineEnterHallDTO.Builder builder = OnlineEnterHallDTO.newBuilder();
        builder.setHallId(f5274c);
        builder.setPassword(valueOf);
        mainGameAdapter.connectionService.writeData(29, builder.build());
        dialogInterface.dismiss();
    }
}