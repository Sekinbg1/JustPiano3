package ly.pp.justpiano3.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ly.pp.justpiano3.R;

import java.util.List;

public final class PopupWindowSelectAdapter extends BaseAdapter {
    Handler handler;
    private final List<String> list;
    private final Activity activity;
    private final int messageWhat;

    public PopupWindowSelectAdapter(Activity activity, Handler handler, List<String> arrayList, int messageWhat) {
        this.activity = activity;
        this.handler = handler;
        list = arrayList;
        this.messageWhat = messageWhat;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            view = LayoutInflater.from(activity).inflate(R.layout.page_list, null);
            textView = view.findViewById(R.id.page_item);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(list.get(i));
        textView.setOnClickListener(v -> {
            Message message = Message.obtain(handler);
            Bundle bundle = new Bundle();
            bundle.putInt("selIndex", i);
            message.setData(bundle);
            message.what = messageWhat;
            handler.sendMessage(message);
        });
        return view;
    }
}