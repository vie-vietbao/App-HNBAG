package com.example.demoapphnbag2.ScreenDrops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.GridView.GridAdapterAdvice;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.FragmentAdviceBinding;

public class AdviceFragment extends Fragment {

    FragmentAdviceBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_advice, container, false);


        binding = FragmentAdviceBinding.inflate(getLayoutInflater());


        String[] flName = {"Bánh mì PewPew", "Cơm tấm Sài Bì Chưởng", "Lẩu Yongkang", "MixiFood", "Katholic", "Mismenu"};
        String[] flDescription = {"Dec 17", "Dec 19", "Dec 19", "Dec 19", "Dec 19", "Dec 19"};
        int[] flImg = {R.drawable.banh_mi_pewpew, R.drawable.sa_bi_chuong, R.drawable.yongkang, R.drawable.mixifood, R.drawable.katholic, R.drawable.mismenu};

        GridAdapterAdvice gridAdapterAdvice = new GridAdapterAdvice(getActivity(), flName, flDescription, flImg);

        binding.gvAdvice.setAdapter(gridAdapterAdvice);

        binding.gvAdvice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flName[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}