package ly.pp.justpiano3.listener;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import ly.pp.justpiano3.activity.OLPlayRoomInterface;
import ly.pp.justpiano3.activity.OLPlayKeyboardRoom;
import ly.pp.justpiano3.activity.OLPlayRoom;
import ly.pp.justpiano3.constant.OnlineProtocolType;
import protobuf.dto.OnlineSendMailDTO;

public final class SendMailClick implements OnClickListener {
    private final OLPlayRoomInterface olPlayRoomInterface;
    private final TextView textView;
    private final String f5509c;

    public SendMailClick(OLPlayRoomInterface olPlayRoomInterface, TextView textView, String str) {
        this.olPlayRoomInterface = olPlayRoomInterface;
        this.textView = textView;
        f5509c = str;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if (olPlayRoomInterface instanceof OLPlayRoom) {
            OLPlayRoom olPlayRoom = (OLPlayRoom) olPlayRoomInterface;
            String valueOf = String.valueOf(textView.getText());
            if (valueOf.isEmpty() || valueOf.equals("'")) {
                Toast.makeText(olPlayRoom, "请输入信件内容!", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 500) {
                Toast.makeText(olPlayRoom, "确定在五百字之内!", Toast.LENGTH_SHORT).show();
            } else {
                OnlineSendMailDTO.Builder builder = OnlineSendMailDTO.newBuilder();
                builder.setName(f5509c);
                builder.setMessage(valueOf);
                if (!f5509c.isEmpty()) {
                    olPlayRoom.connectionService.writeData(OnlineProtocolType.SEND_MAIL, builder.build());
                }
                dialogInterface.dismiss();
                Toast.makeText(olPlayRoom, "发送成功!", Toast.LENGTH_SHORT).show();
            }
        } else if (olPlayRoomInterface instanceof OLPlayKeyboardRoom) {
            OLPlayKeyboardRoom olPlayKeyboardRoom = (OLPlayKeyboardRoom) olPlayRoomInterface;
            String valueOf = String.valueOf(textView.getText());
            if (valueOf.isEmpty() || valueOf.equals("'")) {
                Toast.makeText(olPlayKeyboardRoom, "请输入信件内容!", Toast.LENGTH_SHORT).show();
            } else if (valueOf.length() > 500) {
                Toast.makeText(olPlayKeyboardRoom, "确定在五百字之内!", Toast.LENGTH_SHORT).show();
            } else {
                OnlineSendMailDTO.Builder builder = OnlineSendMailDTO.newBuilder();
                builder.setMessage(valueOf);
                builder.setName(f5509c);
                if (!f5509c.isEmpty()) {
                    olPlayKeyboardRoom.connectionService.writeData(OnlineProtocolType.SEND_MAIL, builder.build());
                }
                dialogInterface.dismiss();
                Toast.makeText(olPlayKeyboardRoom, "发送成功!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}