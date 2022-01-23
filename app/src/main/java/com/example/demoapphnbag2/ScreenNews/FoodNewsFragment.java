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
import com.example.demoapphnbag2.databinding.FragmentFoodNewsBinding;

public class FoodNewsFragment extends Fragment {

    FragmentFoodNewsBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_news, container, false);

        binding = FragmentFoodNewsBinding.inflate(getLayoutInflater());



        String[] flType = {"Địa điểm hot", "Đại điểm hot", "Cơm tấm Sài Bì Chưởng", "Cơm tấm Sài Bì Chưởng",
                            "Địa điểm hot", "Đại điểm hot", "Cơm tấm Sài Bì Chưởng", "Cơm tấm Sài Bì Chưởng"};
        String[] flTitle = {"Sà Bì Chưởng", "Bánh mì PewPew", "Hakyfood", "YongKang",
                            "Cơm quê mười khó", "A mà Kitchen", "Vua Cua", "Bún đậu - Mạc Văn Khoa"};
        String[] flDate = {"Dec, 24, 2020", "Dec, 20, 2022", "Dec, 16, 2022", "Dec, 16, 2022",
                            "Dec, 24, 2020", "Dec, 20, 2022", "Dec, 16, 2022", "Dec, 16, 2022"};
        String[] flLike = {"55,271", "50,006", "50,006", "50,006", "55,271", "50,006", "50,006", "50,006"};
        String[] flMes = {"1,573", "2,185", "4", "4", "1,573", "2,185", "4", "4"};
        int[] flImg = {R.drawable.sa_bi_chuong, R.drawable.banh_mi_pewpew, R.drawable.hakyfood, R.drawable.yongkang,
                        R.drawable.rice_10kho, R.drawable.ama_kitchen, R.drawable.king_crab, R.drawable.mac_van_khoa};

        ListAdapterNews listAdapterNews = new ListAdapterNews(getActivity(), flType, flTitle, flDate, flLike, flMes, flImg);
        binding.lvFoodNews.setAdapter(listAdapterNews);
        binding.lvFoodNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "You click on " + flTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
