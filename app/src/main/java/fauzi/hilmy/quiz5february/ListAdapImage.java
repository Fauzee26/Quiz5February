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

public class ListAdapImage extends BaseAdapter {
    ImageView imgView;
    TextView text1, text2;
    String[][] data;
    Activity activity;

    public ListAdapImage(Activity activity, String[][] data) {
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
            v = vi.inflate(R.layout.activity_custom_image_list, null);
        }

        Object p = getItem(position);

        if (p != null) {
            imgView = (ImageView) v.findViewById(R.id.imageView);

            text1 = (TextView) v.findViewById(R.id.txt1);
            text2 = (TextView) v.findViewById(R.id.txt2);

            int id = activity.getResources().getIdentifier(data[position][0], "drawable", activity.getPackageName());
            Drawable drawable = activity.getResources().getDrawable(id);

            imgView.setImageDrawable(drawable);
            text1.setText(data[position][1]);
            text2.setText(data[position][4]);
        }

        return v;
    }
}
