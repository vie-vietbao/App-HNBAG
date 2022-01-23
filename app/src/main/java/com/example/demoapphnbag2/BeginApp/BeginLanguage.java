package com.example.demoapphnbag2.BeginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.R;

public class BeginLanguage extends AppCompatActivity {

    Button btnVie, btnEl;
    ImageButton imgbtnNext;
    FrameLayout flNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_language);

        btnVie = findViewById(R.id.btnVie);
        btnEl = findViewById(R.id.btnEl);
        imgbtnNext = findViewById(R.id.imgbtnNext);
        flNext = findViewById(R.id.flNext);


//        findViewById(R.id.btnVie).setBackgroundResource(R.drawable.bg_btn_begin);

        btnVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVie.setBackgroundResource(R.drawable.bg_btn_choose);
                btnVie.setTextColor(getColor(R.color.white));
                btnEl.setBackgroundResource(R.drawable.bg_btn_begin);
                btnEl.setTextColor(getColor(R.color.midnight));
                flNext.setBackgroundResource(R.drawable.bg_btn_begin_next_choose);
                imgbtnNext.setBackgroundResource(R.drawable.logo_next_2);


            }
        });

        btnEl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVie.setBackgroundResource(R.drawable.bg_btn_begin);
                btnVie.setTextColor(getColor(R.color.midnight));
                btnEl.setBackgroundResource(R.drawable.bg_btn_choose);
                btnEl.setTextColor(getColor(R.color.white));
                flNext.setBackgroundResource(R.drawable.bg_btn_begin_next_choose);
                imgbtnNext.setBackgroundResource(R.drawable.logo_next_2);


            }
        });

        findViewById(R.id.flNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeginLanguage.this, BeginNotification.class);
                startActivity(intent);
            }
        });



    }

}