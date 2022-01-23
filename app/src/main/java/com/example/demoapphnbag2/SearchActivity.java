package com.example.demoapphnbag2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        (findViewById(R.id.tvCancel)).setOnClickListener(v -> onBackPressed());
    }
}