package ly.pp.justpiano3.listener;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import ly.pp.justpiano3.activity.OLPlayHall;
import ly.pp.justpiano3.constant.OnlineProtocolType;
import protobuf.dto.OnlineSendMailDTO;

public final class SendMessageClick2 implements OnClickListener {
    private final OLPlayHall olPlayHall;
    private final TextView textview;
    private final String str;

    public SendMessageClick2(OLPlayHall olPlayHall, TextView textView, String string) {
        this.olPlayHall = olPlayHall;
        textview = textView;
        str = string;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String valueOf = String.valueOf(textview.getText());
        if (valueOf.isEmpty() || valueOf.equals("'")) {
            Toast.makeText(olPlayHall, "请输入信件内容!", Toast.LENGTH_SHORT).show();
        } else if (valueOf.length() > 500) {
            Toast.makeText(olPlayHall, "确定在五百字之内!", Toast.LENGTH_SHORT).show();
        } else {
            OnlineSendMailDTO.Builder builder = OnlineSendMailDTO.newBuilder();
            builder.setName(str);
            builder.setMessage(valueOf);
            if (!str.isEmpty()) {
                olPlayHall.connectionService.writeData(OnlineProtocolType.SEND_MAIL, builder.build());
            }
            dialogInterface.dismiss();
            Toast.makeText(olPlayHall, "发送成功!", Toast.LENGTH_SHORT).show();
        }
    }
}