package com.example.demoapphnbag2.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.SettingOption.SettingActivity;
import com.example.demoapphnbag2.SettingOption.SettingLogin;
import com.example.demoapphnbag2.SettingOption.SettingRegister;
import com.example.demoapphnbag2.databinding.FragmentMoreBinding;

public class MoreFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_more, container, false);

//        (view.findViewById(R.id.imgBack)).setOnClickListener(v -> getActivity().onBackPressed());

        (view.findViewById(R.id.imgSetting)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });

        (view.findViewById(R.id.btnLogin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingLogin.class);
                startActivity(intent);
            }
        });

        (view.findViewById(R.id.btnRegister)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingRegister.class);
                startActivity(intent);
            }
        });

        return view;
    }
//    private void loadFragment(Fragment fragment) {
//        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.flFragment, fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

}