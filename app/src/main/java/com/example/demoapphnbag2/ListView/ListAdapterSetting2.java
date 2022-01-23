package com.example.demoapphnbag2.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoapphnbag2.R;

public class ListAdapterSetting2 extends BaseAdapter {

    Context context;
    String[] flType;
    String[] flOpt;



    LayoutInflater inflater;

    public ListAdapterSetting2(Context context, String[] flType, String[] flOpt) {
        this.context = context;
        this.flType = flType;
        this.flOpt = flOpt;

    }

    @Override
    public int getCount() {
        return flOpt.length;
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
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView =inflater.inflate(R.layout.list_view_setting2, null);
        }


        TextView textType = convertView.findViewById(R.id.item_Languages);
        TextView textOpt = convertView.findViewById(R.id.item_Opt);

        textType.setText(flType[position]);
        textOpt.setText(flOpt[position]);

        return convertView;
    }
}
