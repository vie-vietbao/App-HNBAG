package com.example.demoapphnbag2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapterSettingAccount extends BaseAdapter {

    Context context;
    String[] flType;
    String[] flOpt;



    LayoutInflater inflater;

    public ListAdapterSettingAccount(Context context, String[] flType, String[] flOpt) {
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
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView =inflater.inflate(R.layout.list_view_setting_account, null);
        }


        TextView textType = convertView.findViewById(R.id.item_Languages);
        TextView textOpt = convertView.findViewById(R.id.item_Opt);

        textType.setText(flType[position]);
        textOpt.setText(flOpt[position]);

        return convertView;
    }
}
