package fauzi.hilmy.quiz5february;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 26FaUZeE02 on 2/6/18.
 */

public class ListAdapter extends BaseAdapter {

    TextView text1, text2;
    String[][] data;
    Activity activity;

    public ListAdapter(Activity activity, String[][] data) {
        super();
        this.data = data;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(activity);
            v = vi.inflate(R.layout.activity_custom_list_view, null);
        }

        Object p = getItem(position);

        if (p != null) {
            text1 = (TextView) v.findViewById(R.id.text1);
            text2 = (TextView) v.findViewById(R.id.text2);

            text1.setText(data[position][0]);
            text2.setText(data[position][1]);
        }

        return v;
    }
}
