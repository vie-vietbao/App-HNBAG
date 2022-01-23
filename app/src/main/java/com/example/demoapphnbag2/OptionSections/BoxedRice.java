package com.example.demoapphnbag2.OptionSections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.ViewPager.ViewPagerAdapterOPSBR;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class BoxedRice extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPagerAdapterOPSBR viewPagerAdapterOPSBR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxed_rice);

        (findViewById(R.id.imgBack)).setOnClickListener(v -> onBackPressed());

        tabLayout = findViewById(R.id.tl_news);
        viewPager = findViewById(R.id.vp_news);

        viewPagerAdapterOPSBR = new ViewPagerAdapterOPSBR(this);
        viewPager.setAdapter(viewPagerAdapterOPSBR);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Gợi ý") ;
                    break;
                case 1:
                    tab.setText("Phổ biến");
                    break;
            }
        }).attach();

    }
}