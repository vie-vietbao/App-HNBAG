package com.example.demoapphnbag2.SettingOption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapphnbag2.ListAdapterSettingAccount;
import com.example.demoapphnbag2.ListView.ListAdapterSetting2;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.ActivitySettingBinding;

import java.util.ArrayList;
import java.util.List;

public class SettingActivity extends AppCompatActivity {

    ActivitySettingBinding binding;

    ListView lvAccount, lvSetting, lvShare, lvSupport, lvLegal;
    List<String> listAccount, listSetting, listShare, listSupport, listLegal;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        Hàm dùng cho fragment
//        (view.findViewById(R.id.imgBack)).setOnClickListener(v -> getActivity().onBackPressed());

        (findViewById(R.id.imgBack)).setOnClickListener(v -> onBackPressed());

//        lvAccount = findViewById(R.id.lvAccount);
//
//        listAccount = new ArrayList<>();
//        listAccount.add("Personalize Your Feed");
//        listAccount.add("Login");
//        listAccount.add("Register");
//        adapter = new ArrayAdapter(SettingActivity.this, android.R.layout.simple_list_item_1, listAccount);
//        lvAccount.setAdapter(adapter);
//        lvAccount.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Intent intent = new Intent(SettingActivity.this, SettingLogin.class);
//                    startActivity(intent);
//                }else if (position == 1) {
//                    Intent intent = new Intent(SettingActivity.this, SettingLogin.class);
//                    startActivity(intent);
//                }else if (position == 2) {
//                    Intent intent = new Intent(SettingActivity.this, SettingRegister.class);
//                    startActivity(intent);
//                }
//            }
//        });
        String[] flType = {"Personalize Your Feed", "Login", "Register"};
        String[] flOpt = {"", "", ""};
        ListAdapterSettingAccount listAdapterSettingAccount = new ListAdapterSettingAccount(SettingActivity.this, flType, flOpt);
        binding.lvAccount.setAdapter(listAdapterSettingAccount);
        binding.lvAccount.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(SettingActivity.this, SettingLogin.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(SettingActivity.this, SettingLogin.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(SettingActivity.this, SettingRegister.class);
                    startActivity(intent);
                }
            }
        });


        String[] flType1 = {"Languages", "Dark Mode", "Compact Layout", "Push Notifications"};
        String[] flOpt1 = {"English", "Light", "Normal", "No"};
        ListAdapterSetting2 listAdapterSetting2 = new ListAdapterSetting2(SettingActivity.this, flType1, flOpt1);
        binding.lvSetting.setAdapter(listAdapterSetting2);
        binding.lvSetting.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(SettingActivity.this, "1", Toast.LENGTH_SHORT).show();
                }else if (position == 1){
                    Intent intent = new Intent(SettingActivity.this, DarkMode.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Toast.makeText(SettingActivity.this, "Xin lỗi! Phiên bản này chưa hỗ trợ Compact Layout", Toast.LENGTH_SHORT).show();
                }else if (position == 3) {
                    Intent intent = new Intent(SettingActivity.this, Notification.class);
                    startActivity(intent);
                }
            }
        });

        lvShare = findViewById(R.id.lvShare);
        listShare = new ArrayList<>();
        listShare.add("Share this app");
        listShare.add("Rate in the App Store");
        adapter = new ArrayAdapter(SettingActivity.this, android.R.layout.simple_list_item_1, listShare);
        lvShare.setAdapter(adapter);
        lvShare.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(SettingActivity.this, "1", Toast.LENGTH_SHORT).show();
                }else if (position == 1){
                    Toast.makeText(SettingActivity.this, "2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        lvSupport = findViewById(R.id.lvSupport);
        listSupport = new ArrayList<>();
        listSupport.add("Contact Us");
        listSupport.add("Report bug");
        listSupport.add("Clear the Cache");
        adapter = new ArrayAdapter(SettingActivity.this, android.R.layout.simple_list_item_1, listSupport);
        lvSupport.setAdapter(adapter);
        lvSupport.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(SettingActivity.this, "1", Toast.LENGTH_SHORT).show();
                }else if (position == 1){
                    Toast.makeText(SettingActivity.this, "2", Toast.LENGTH_SHORT).show();
                }else if (position == 2) {
                    Toast.makeText(SettingActivity.this, "3", Toast.LENGTH_SHORT).show();
                }
            }
        });

        lvLegal = findViewById(R.id.lvLegal);
        listLegal = new ArrayList<>();
        listLegal.add("Terms & Conditions");
        listLegal.add("Privacy Policy");
        listLegal.add("Privacy Settings");
        adapter = new ArrayAdapter(SettingActivity.this, android.R.layout.simple_list_item_1, listLegal);
        lvLegal.setAdapter(adapter);
        lvLegal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(SettingActivity.this, "1", Toast.LENGTH_SHORT).show();
                }else if (position == 1){
                    Toast.makeText(SettingActivity.this, "2", Toast.LENGTH_SHORT).show();
                }else if (position == 2) {
                    Toast.makeText(SettingActivity.this, "3", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}