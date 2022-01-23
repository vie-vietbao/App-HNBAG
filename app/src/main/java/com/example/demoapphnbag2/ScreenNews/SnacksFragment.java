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
import com.example.demoapphnbag2.databinding.FragmentSnacksBinding;


public class SnacksFragment extends Fragment {

    FragmentSnacksBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_snacks, container, false);

        binding = FragmentSnacksBinding.inflate(getLayoutInflater());

        String[] flType = {"", "", "", "", "", ""};
        String[] flTitle = {"Bánh mì cay Bà Già", "Bánh mì que Đinh Tiên Hoàng", "Bánh đa cua Lạch Chay", "Bánh đúc Tàu",
                            "Bún cá cô Hương", "Cháo cay"};
        String[] flDate = {"Dec, 24, 2020", "Dec, 20, 2022", "Dec, 16, 2022", "Dec, 16, 2022", "Dec, 16, 2022", "Dec, 16, 2022"};
        String[] flLike = {"55,271", "50,006", "50,006", "50,006", "50,006", "50,006"};
        String[] flMes = {"1,573", "2,185", "4", "4", "4", "4"};
        int[] flImg = {R.drawable.banh_mi_cay_ba_gia, R.drawable.banh_mi_cay_dth, R.drawable.banh_da_cua_lach_chay, R.drawable.banh_duc_tau,
                        R.drawable.bun_ca_co_huong,R.drawable.chao_cay};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvSnackNews.setAdapter(listAdapterNews);
        binding.lvSnackNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
