package com.example.demoapphnbag2.OptionSections;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.ViewPager.ViewPagerAdapterOPSF;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Food extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPagerAdapterOPSF viewPagerAdapterOPSF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        (findViewById(R.id.imgBack)).setOnClickListener(v -> onBackPressed());

        tabLayout = findViewById(R.id.tl_news);
        viewPager = findViewById(R.id.vp_news);

        viewPagerAdapterOPSF = new ViewPagerAdapterOPSF(this);
        viewPager.setAdapter(viewPagerAdapterOPSF);

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Gợi ý") ;
                        break;
                    case 1:
                        tab.setText("Phổ biến");
                        break;
                }
            }
        }).attach();

    }
}