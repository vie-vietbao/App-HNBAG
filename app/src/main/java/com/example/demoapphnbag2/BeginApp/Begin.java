package com.example.demoapphnbag2.BeginApp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.MainActivity;
import com.example.demoapphnbag2.MySharedPreferences;
import com.example.demoapphnbag2.R;

public class Begin extends AppCompatActivity {

    int standby_screen_TIME_OUT = 3000;
    private static final  String KEY_FIRST_INAPP = "KEY_FIRST_INAPP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        MySharedPreferences mySharedPreferences = new  MySharedPreferences(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mySharedPreferences.getBooleanValue(KEY_FIRST_INAPP)) {
                    startActivity(MainActivity.class);
                }else {
                    startActivity(BeginLanguage.class);
                    mySharedPreferences.putBooleanValue(KEY_FIRST_INAPP, true);

                }
//                nextActivity();
//
            }
        }, standby_screen_TIME_OUT);
    }

//        private void nextActivity(){
//            Intent intent = new Intent(Begin.this, BeginLanguage.class);
//                startActivity(intent);
//                finish();
////
//        }
    private void startActivity(Class<?> cls){
        Intent intent = new Intent(Begin.this, cls);
        startActivity(intent);
        finish();
    }
}