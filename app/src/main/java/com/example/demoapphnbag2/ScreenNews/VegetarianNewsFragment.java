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
import com.example.demoapphnbag2.databinding.FragmentVegetarianNewsBinding;

public class VegetarianNewsFragment extends Fragment {

    FragmentVegetarianNewsBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vegetarian_news, container, false);

        binding = FragmentVegetarianNewsBinding.inflate(getLayoutInflater());

        String[] flType = {"Đồ ăn", "Đồ ăn"};
        String[] flTitle = {"Buffet chay Hương Thiền", "Chuỗi Buffet Chay Veggie"};
        String[] flDate = {"Dec, 24, 2020", "Dec, 24, 2020"};
        String[] flLike = {"55,271", "50,006"};
        String[] flMes = {"1,573", "1,573"};
        int[] flImg = {R.drawable.huong_thien, R.drawable.veggie};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvVegetarianNews.setAdapter(listAdapterNews);
        binding.lvVegetarianNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
