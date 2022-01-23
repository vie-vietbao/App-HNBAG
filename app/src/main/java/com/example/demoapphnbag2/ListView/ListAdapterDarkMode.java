package com.example.demoapphnbag2.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoapphnbag2.R;

public class ListAdapterDarkMode extends BaseAdapter {

    Context context;
    String[] flType;
    int[] image;



    LayoutInflater inflater;

    public ListAdapterDarkMode(Context context, String[] flType, int[] image) {
        this.context = context;
        this.flType = flType;
        this.image = image;

    }

    @Override
    public int getCount() {
        return flType.length;
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

            convertView =inflater.inflate(R.layout.list_view_dark_mode, null);
        }


        TextView textType = convertView.findViewById(R.id.item_Type);
        ImageView imageView = convertView.findViewById(R.id.item_img);

        textType.setText(flType[position]);
        imageView.setImageResource(image[position]);

        return convertView;
    }
}
