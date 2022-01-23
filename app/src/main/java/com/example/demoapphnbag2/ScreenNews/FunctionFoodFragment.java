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
import com.example.demoapphnbag2.databinding.FragmentFunctionFoodBinding;

public class FunctionFoodFragment extends Fragment {

    FragmentFunctionFoodBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_function_food, container, false);

        binding = FragmentFunctionFoodBinding.inflate(getLayoutInflater());

        String[] flType = {"Thực phẩm chức năng", "Thực phẩm chức năng"};
        String[] flTitle = {"Bún gạo lứt - Phan Bảo Long", "WheyStore"};
        String[] flDate = {"Dec, 24, 2020", "Dec, 20, 2022"};
        String[] flLike = {"55,271", "50,006"};
        String[] flMes = {"1,573", "2,185"};
        int[] flImg = {R.drawable.bun_gao_lut, R.drawable.wheystore};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvFunctionNews.setAdapter(listAdapterNews);
        binding.lvFunctionNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
