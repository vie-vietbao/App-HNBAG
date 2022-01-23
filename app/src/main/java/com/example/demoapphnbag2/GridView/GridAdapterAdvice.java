package com.example.demoapphnbag2.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoapphnbag2.R;

public class GridAdapterAdvice extends BaseAdapter {

    Context context;
    String[] flName;
    String[] flDescription;
    int[] image;

    LayoutInflater inflater;

    public GridAdapterAdvice(Context context, String[] flName, String[] flDescription, int[] image) {
        this.context = context;
        this.flName = flName;
        this.flDescription = flDescription;
        this.image = image;
    }

    @Override
    public int getCount() {
        return flName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView =inflater.inflate(R.layout.grid_view_advice, null);
        }

        ImageView imageView = convertView.findViewById(R.id.item_img);
        TextView textView = convertView.findViewById(R.id.item_name);
        TextView textdes = convertView.findViewById(R.id.item_des);

        imageView.setImageResource(image[position]);
        textView.setText(flName[position]);
        textdes.setText(flDescription[position]);

        return convertView;
    }
}
