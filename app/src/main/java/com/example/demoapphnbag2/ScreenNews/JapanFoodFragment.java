package com.example.demoapphnbag2.ScreenNews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.ListView.ListAdapterNews;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.FragmentJapanBinding;

public class JapanFoodFragment extends Fragment {

    FragmentJapanBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_japan, container, false);

        binding = FragmentJapanBinding.inflate(getLayoutInflater());

        String[] flType = {"Đồ ăn Nhật", "Đồ ăn Nhật", "Đồ ăn Nhật", "Đồ ăn Nhật"};
        String[] flTitle = {"Yakimono", "Yakimono", "Yakimono", "Yakimono"};
        String[] flDate = {"Dec, 20, 2021", "Dec, 20, 2021", "Dec, 20, 2021", "Dec, 20, 2021"};
        String[] flLike = {"55,271", "50,006", "50,006", "50,006"};
        String[] flMes = {"1,573", "2,185", "4", "4"};
        int[] flImg = {R.drawable.yakimono, R.drawable.yakimono, R.drawable.yakimono, R.drawable.yakimono};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvJapanNews.setAdapter(listAdapterNews);
        binding.lvJapanNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
