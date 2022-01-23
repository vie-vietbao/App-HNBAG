package com.example.demoapphnbag2.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demoapphnbag2.GridView.GridAdapterHotNew;
import com.example.demoapphnbag2.R;

public class ListAdapterHotNews extends BaseAdapter {

    Context context;
    String[] flType;
    String[] flTitle;
    String[] flDate;
    String[] flLike;
    String[] flMes;
    int[] image;


    LayoutInflater inflater;

    ImageView img_share, img_save;

    public ListAdapterHotNews(Context context, String[] flType, String[] flTitle, String[] flDate, String[] flLike, String[] flMes, int[] image) {
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
        return flTitle.length + 2;
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

        if (position == 0) {

            convertView = inflater.inflate(R.layout.fragment_hot_relativelayout, null);

            RelativeLayout rvlHot = convertView.findViewById(R.id.RvlHot);
            rvlHot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "You click on hot 1", Toast.LENGTH_SHORT).show();
                }
            });


        } else if (position == 1) {

            convertView = inflater.inflate(R.layout.fragment_hot_gridview, null);

            String[] flName = {"Bánh mì PewPew", "Hakifood"};
            int[] flImg = {R.drawable.banh_mi_pewpew, R.drawable.hakyfood2};

            GridAdapterHotNew gridAdapterHotNew = new GridAdapterHotNew(context, flName, flImg);
            GridView gvHotNews = convertView.findViewById(R.id.gvHot_news);

            gvHotNews.setAdapter(gridAdapterHotNew);
            gvHotNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(context, "You click on " + flName[position], Toast.LENGTH_SHORT).show();
                }
            });

        } else {

            convertView = inflater.inflate(R.layout.list_view_hot_news, null);

            ImageView imageView2 = convertView.findViewById(R.id.item_img);
            TextView textType = convertView.findViewById(R.id.item_typpe);
            TextView textTitle = convertView.findViewById(R.id.item_title);
            TextView textDate = convertView.findViewById(R.id.item_date);
            TextView textLike = convertView.findViewById(R.id.item_like);
            TextView textMes = convertView.findViewById(R.id.item_mes);

            imageView2.setImageResource(image[position - 2]);
            textType.setText(flType[position - 2]);
            textTitle.setText(flTitle[position - 2]);
            textDate.setText(flDate[position - 2]);
            textLike.setText(flLike[position - 2]);
            textMes.setText(flMes[position - 2]);

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

        }

        return convertView;
    }
}
