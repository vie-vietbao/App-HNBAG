package com.example.demoapphnbag2.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;


import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.ViewPager.ViewPagerAdapterDrops;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DropsFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPagerAdapterDrops viewPagerAdapterDrops;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_drops, container, false);

        tabLayout = (view.findViewById(R.id.tl_news));
        viewPager = (view.findViewById(R.id.vp_news));

        viewPagerAdapterDrops = new ViewPagerAdapterDrops(getActivity());
        viewPager.setAdapter(viewPagerAdapterDrops);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Sắp ra mắt") ;
                    break;
                case 1:
                    tab.setText("Lời khuyên");
                    break;
                case 2:
                    tab.setText("Yêu thích");
                    break;
            }
        }).attach();

        return view;
    }
}