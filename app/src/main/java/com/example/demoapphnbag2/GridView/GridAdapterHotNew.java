package com.example.demoapphnbag2.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoapphnbag2.R;

public class GridAdapterHotNew extends BaseAdapter {

    Context context;
    String[] flName;
    int[] image;

    LayoutInflater inflater;

    public GridAdapterHotNew(Context context, String[] flName, int[] image) {
        this.context = context;
        this.flName = flName;
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

            convertView =inflater.inflate(R.layout.grid_view_hot_new, null);
        }

        ImageView imageView = convertView.findViewById(R.id.item_img);
        TextView textView = convertView.findViewById(R.id.item_name);

        imageView.setImageResource(image[position]);
        textView.setText(flName[position]);

        return convertView;
    }
}
