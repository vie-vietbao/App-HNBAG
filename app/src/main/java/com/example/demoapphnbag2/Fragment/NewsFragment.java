package com.example.demoapphnbag2.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;


import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.SearchActivity;
import com.example.demoapphnbag2.SettingOption.SettingActivity;
import com.example.demoapphnbag2.SettingOption.SettingLogin;
import com.example.demoapphnbag2.ViewPager.ViewPagerAdapterNews;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NewsFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPagerAdapterNews viewPagerAdapterNews;

    ImageView imgSearch;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        imgSearch = view.findViewById(R.id.imgSearch);
        imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });

        tabLayout = (view.findViewById(R.id.tl_news));
        viewPager = (view.findViewById(R.id.vp_news));

        viewPagerAdapterNews = new ViewPagerAdapterNews(getActivity());
        viewPager.setAdapter(viewPagerAdapterNews);

        viewPager.setOffscreenPageLimit(3);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Hot") ;
                    break;
                case 1:
                    tab.setText("Địa điểm hot");
                    break;
                case 2:
                    tab.setText("Thực phẩm chức năng");
                    break;
                case 3:
                    tab.setText("Đồ ăn Nhật");
                    break;
                case 4:
                    tab.setText("Đồ ăn Thái");
                    break;
                case 5:
                    tab.setText("Đồ ăn Hàn");
                    break;
                case 6:
                    tab.setText("Đồ ăn");
                    break;
                case 7:
                    tab.setText("Đồ uống");
                    break;
                case 8:
                    tab.setText("Đồ chay");
                    break;
                case 9:
                    tab.setText("Bánh kem");
                    break;
                case 10:
                    tab.setText("Nhà làm");
                    break;
                case 11:
                    tab.setText("Đồ ăn Vặt");
                    break;
                case 12:
                    tab.setText("Pizza/Burger");
                    break;
                case 13:
                    tab.setText("Lẩu");
                    break;
                case 14:
                    tab.setText("Cơm");
                    break;
            }
        }).attach();

        return view;
    }

}