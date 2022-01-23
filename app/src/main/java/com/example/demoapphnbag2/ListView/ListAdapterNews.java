package com.example.demoapphnbag2.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demoapphnbag2.GridView.GridAdapterHotNew;
import com.example.demoapphnbag2.R;

public class ListAdapterNews extends BaseAdapter {

    Context context;
    String[] flType;
    String[] flTitle;
    String[] flDate;
    String[] flLike;
    String[] flMes;
    int[] image;


    LayoutInflater inflater;

    ImageView img_share, img_save;

    public ListAdapterNews(Context context, String[] flType, String[] flTitle, String[] flDate, String[] flLike, String[] flMes, int[] image) {
        this.context = context;
        this.flType = flType;
        this.flTitle = flTitle;
        this.flDate = flDate;
        this.flLike = flLike;
        this.flMes = flMes;
        this.image = image;
    }

    @Override
    public int getCount() {
        return flTitle.length;
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

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.list_view_news, null);
        }


        ImageView imageView2 = convertView.findViewById(R.id.item_img);
        TextView textType = convertView.findViewById(R.id.item_typpe);
        TextView textTitle = convertView.findViewById(R.id.item_title);
        TextView textDate = convertView.findViewById(R.id.item_date);
        TextView textLike = convertView.findViewById(R.id.item_like);
        TextView textMes = convertView.findViewById(R.id.item_mes);

        imageView2.setImageResource(image[position]);
        textType.setText(flType[position]);
        textTitle.setText(flTitle[position]);
        textDate.setText(flDate[position]);
        textLike.setText(flLike[position]);
        textMes.setText(flMes[position]);




        img_share = convertView.findViewById(R.id.img_share);
        img_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Da share", Toast.LENGTH_SHORT).show();
            }
        });

        img_save = convertView.findViewById(R.id.img_save);
        img_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Da save", Toast.LENGTH_SHORT).show();

            }
        });

        return convertView;
    }




}
