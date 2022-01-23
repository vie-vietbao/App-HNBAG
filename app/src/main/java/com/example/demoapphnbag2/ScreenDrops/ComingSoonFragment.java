package com.example.demoapphnbag2.ScreenDrops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.GridView.GridAdapterComing;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.FragmentComingSoonBinding;

public class ComingSoonFragment extends Fragment {

    FragmentComingSoonBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coming_soon, container, false);

        binding = FragmentComingSoonBinding.inflate(getLayoutInflater());

        String[] flDate = {"Date 16", "Date 19"};
        String[] flName = {"Bánh mì PewPew", "Cơm tấm Sài Bì Chưởng"};
        int[] flImg = {R.drawable.banh_mi_pewpew, R.drawable.sa_bi_chuong};

        GridAdapterComing gridAdapterComing = new GridAdapterComing(getActivity(), flDate, flName, flImg);

        binding.gvComingSoon.setAdapter(gridAdapterComing);

        binding.gvComingSoon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flName[position], Toast.LENGTH_SHORT).show();
            }
        });
    return binding.getRoot();
    }
}