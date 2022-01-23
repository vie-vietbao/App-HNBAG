package com.example.demoapphnbag2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.demoapphnbag2.Fragment.DropsFragment;
import com.example.demoapphnbag2.Fragment.MoreFragment;
import com.example.demoapphnbag2.Fragment.NewsFragment;
import com.example.demoapphnbag2.Fragment.SectionsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnv;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnv = findViewById(R.id.bnv);
        loadFragment(new NewsFragment());
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.btnNews:
                        fragment = new NewsFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.btnSections:
                        fragment = new SectionsFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.btnDrops:
                        fragment = new DropsFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.btnMore:
                        fragment = new MoreFragment();
                        loadFragment(fragment);
                        return true;
                }
                return false;
            }
        });





    }
    private void loadFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


}