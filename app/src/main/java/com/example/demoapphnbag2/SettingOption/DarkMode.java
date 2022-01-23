package com.example.demoapphnbag2.SettingOption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.example.demoapphnbag2.ListView.ListAdapterDarkMode;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.ActivityDarkModeBinding;

public class DarkMode extends AppCompatActivity {

    ActivityDarkModeBinding binding;
    ImageView item_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark_mode);

        item_img = findViewById(R.id.item_img);

        binding = ActivityDarkModeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        findViewById(R.id.imgBack).setOnClickListener(v -> onBackPressed());

        String[] flType = {"Follow System Setting", "Always On", "Always Off"};
        int[] flImg = {R.drawable.logo_none, R.drawable.logo_none, R.drawable.logo_choose_orange};
        ListAdapterDarkMode listAdapterDarkMode = new ListAdapterDarkMode(DarkMode.this, flType, flImg);
        binding.lvDarkmode.setAdapter(listAdapterDarkMode);
        binding.lvDarkmode.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    int[] flImg = {R.drawable.logo_choose_orange, R.drawable.logo_none, R.drawable.logo_none};
                    ListAdapterDarkMode listAdapterDarkMode = new ListAdapterDarkMode(DarkMode.this, flType, flImg);
                    binding.lvDarkmode.setAdapter(listAdapterDarkMode);

                }else if (position == 1){
                    int[] flImg = {R.drawable.logo_none, R.drawable.logo_choose_orange, R.drawable.logo_none};
                    ListAdapterDarkMode listAdapterDarkMode = new ListAdapterDarkMode(DarkMode.this, flType, flImg);
                    binding.lvDarkmode.setAdapter(listAdapterDarkMode);

                }else if (position == 2) {
                    int[] flImg = {R.drawable.logo_none, R.drawable.logo_none, R.drawable.logo_choose_orange};
                    ListAdapterDarkMode listAdapterDarkMode = new ListAdapterDarkMode(DarkMode.this, flType, flImg);
                    binding.lvDarkmode.setAdapter(listAdapterDarkMode);

                }
            }
        });


    }
}