package com.example.demoapphnbag2.ScreenNews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.ListView.ListAdapterHotNews;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.FragmentHotBinding;


public class HotNewsFragment extends Fragment {

    FragmentHotBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot, container, false);
        binding = FragmentHotBinding.inflate(getLayoutInflater());

        String[] flType = {"Lẩu", "Đồ ăn vặt", "Đồ uống", "Đồ ăn vặt"};
        String[] flTitle = {"Yongkang", "MixiFood", "Katholic", "Mismenu"};
        String[] flDate = {"Dec, 16, 2021", "Dec, 18, 2022", "Dec, 20, 2022", "Dec, 21, 2022"};
        String[] flLike = {"5,000", "1,026", "2,389", "1,227"};
        String[] flMes = {"8", "54", "23", "31"};
        int[] flImg2 = {R.drawable.yongkang2, R.drawable.mixifood, R.drawable.katholic, R.drawable.mismenu};

        ListAdapterHotNews listAdapterHotNews = new ListAdapterHotNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg2);
        binding.lvHotNews.setAdapter(listAdapterHotNews);

        binding.lvHotNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position -2], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}