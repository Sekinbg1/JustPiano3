package ly.pp.justpiano3.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;

import ly.pp.justpiano3.service.ConnectionService;
import protobuf.dto.OnlineHallChatDTO;
import protobuf.dto.OnlineRoomChatDTO;

public final class ExpressAdapter extends BaseAdapter {
    public PopupWindow popupWindow;
    public ConnectionService connectionService;
    public int messageType;
    private final Context context;
    private final Integer[] f6033b;

    public ExpressAdapter(Context context, ConnectionService connectionService, Integer[] numArr, PopupWindow popupWindow, int b) {
        this.context = context;
        f6033b = numArr;
        this.popupWindow = popupWindow;
        this.connectionService = connectionService;
        messageType = b;
    }

    @Override
    public int getCount() {
        return f6033b.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setPadding(0, 0, 0, 0);
        imageView.setImageResource(f6033b[i]);
        imageView.setOnClickListener(v -> {
            if (popupWindow != null && popupWindow.isShowing()) {
                popupWindow.dismiss();
                if (connectionService != null) {
                    if (messageType == 12) {
                        OnlineHallChatDTO.Builder builder = OnlineHallChatDTO.newBuilder();
                        builder.setMessage("//" + i);
                        builder.setUserName("");
                        connectionService.writeData(messageType, builder.build());
                    } else if (messageType == 13) {
                        OnlineRoomChatDTO.Builder builder = OnlineRoomChatDTO.newBuilder();
                        builder.setMessage("//" + i);
                        builder.setUserName("");
                        builder.setColor(99);
                        connectionService.writeData(messageType, builder.build());
                    }
                }
            }
        });
        return imageView;
    }
}
