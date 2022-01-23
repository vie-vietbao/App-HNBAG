package com.example.demoapphnbag2.BeginApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.MainActivity;
import com.example.demoapphnbag2.R;

public class BeginNotification extends AppCompatActivity {

    LinearLayout lnlMorning, lnlNoon, lnlNight;
    Button btnNotification;
    TextView txtvNext, txtvMorning, txtvNoon, txtvNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_notification);

        lnlMorning = findViewById(R.id.lnlMorning);
        lnlNoon = findViewById(R.id.lnlNoon);
        lnlNight = findViewById(R.id.lnlNight);
        btnNotification = findViewById(R.id.btnNotification);
        txtvMorning = findViewById(R.id.txtvMorning);
        txtvNoon = findViewById(R.id.txtvNoon);
        txtvNight = findViewById(R.id.txtvNight);

        lnlMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlMorning.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                lnlNoon.setBackgroundResource(R.drawable.lnl_timeinday);
                lnlNight.setBackgroundResource(R.drawable.lnl_timeinday);
                btnNotification.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                txtvMorning.setTextColor(getColor(R.color.white));
                txtvNoon.setTextColor(getColor(R.color.midnight));
                txtvNight.setTextColor(getColor(R.color.midnight));
                btnNotification.setTextColor(getColor(R.color.white));
            }
        });

        lnlNoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlMorning.setBackgroundResource(R.drawable.lnl_timeinday);
                lnlNoon.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                lnlNight.setBackgroundResource(R.drawable.lnl_timeinday);
                btnNotification.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                txtvMorning.setTextColor(getColor(R.color.midnight));
                txtvNoon.setTextColor(getColor(R.color.white));
                txtvNight.setTextColor(getColor(R.color.midnight));
                btnNotification.setTextColor(getColor(R.color.white));
            }
        });

        lnlNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lnlMorning.setBackgroundResource(R.drawable.lnl_timeinday);
                lnlNoon.setBackgroundResource(R.drawable.lnl_timeinday);
                lnlNight.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                btnNotification.setBackgroundResource(R.drawable.lnl_timeinday_choose);
                txtvMorning.setTextColor(getColor(R.color.midnight));
                txtvNoon.setTextColor(getColor(R.color.midnight));
                txtvNight.setTextColor(getColor(R.color.white));
                btnNotification.setTextColor(getColor(R.color.white));
            }
        });

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BeginNotification.this, "Bạn sẽ đc nhận thông báo vào đúng giờ bạn đã chọn" , Toast.LENGTH_SHORT ).show();
            }
        });

        (findViewById(R.id.txtvNext)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(BeginNotification.this, "ok", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BeginNotification.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}