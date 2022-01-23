package com.example.demoapphnbag2.ScreenSections;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.ListView.ListAdapterNews;
import com.example.demoapphnbag2.R;
import com.example.demoapphnbag2.databinding.FragmentDrinkPopularBinding;
import com.example.demoapphnbag2.databinding.FragmentVegetarianSuggestBinding;


public class VegetarianSuggestFragment extends Fragment {

    FragmentVegetarianSuggestBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chicken_popular, container, false);

        binding = FragmentVegetarianSuggestBinding.inflate(getLayoutInflater());

        String[] flType = {"Địa điểm hot", "Đại điểm hot", "Đại điểm hot", "Đại điểm hot"};
        String[] flTitle = {"YongKang", "Yakimono", "Koh Yam", "Dookki"};
        String[] flDate = {"Dec, 24, 2020", "Dec, 20, 2022", "Dec, 16, 2022", "Dec, 16, 2022"};
        String[] flLike = {"55,271", "50,006", "50,006", "50,006"};
        String[] flMes = {"1,573", "2,185", "4", "4"};
        int[] flImg = {R.drawable.yongkang, R.drawable.yakimono, R.drawable.koh_yam, R.drawable.dookki};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvVegetarianSuggest.setAdapter(listAdapterNews);
        binding.lvVegetarianSuggest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}