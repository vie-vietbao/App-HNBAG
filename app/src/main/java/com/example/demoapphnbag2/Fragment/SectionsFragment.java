package com.example.demoapphnbag2.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.demoapphnbag2.OptionSections.BoxedRice;
import com.example.demoapphnbag2.OptionSections.Chicken;
import com.example.demoapphnbag2.OptionSections.CreamCake;
import com.example.demoapphnbag2.OptionSections.Drinks;
import com.example.demoapphnbag2.OptionSections.Food;
import com.example.demoapphnbag2.OptionSections.HomeMade;
import com.example.demoapphnbag2.OptionSections.Noodles;
import com.example.demoapphnbag2.OptionSections.Pavement;
import com.example.demoapphnbag2.OptionSections.PizzaBurger;
import com.example.demoapphnbag2.OptionSections.Pot;
import com.example.demoapphnbag2.OptionSections.Sushi;
import com.example.demoapphnbag2.OptionSections.VegetarianFood;
import com.example.demoapphnbag2.R;

import java.util.ArrayList;
import java.util.List;

public class SectionsFragment extends Fragment {

    ListView lvSections;
    List<String> listSections;
    ArrayAdapter adapter;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_sections, container, false);

        lvSections = view.findViewById(R.id.lvSections);

        listSections = new ArrayList<>();
        listSections.add("Đồ ăn");
        listSections.add("Đồ uống");
        listSections.add("Đồ chay");
        listSections.add("Bánh kem");
        listSections.add("Nhà làm");
        listSections.add("Vỉa hè");
        listSections.add("Pizza/Burger");
        listSections.add("Món gà");
        listSections.add("Món lẩu");
        listSections.add("Sushi");
        listSections.add("Mì phở");
        listSections.add("Cơm hộp");
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, listSections);
        lvSections.setAdapter(adapter);
        lvSections.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Food.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(getActivity(), Drinks.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(getActivity(), VegetarianFood.class);
                    startActivity(intent);
                }else if (position == 3) {
                    Intent intent = new Intent(getActivity(), CreamCake.class);
                    startActivity(intent);
                }else if (position == 4) {
                    Intent intent = new Intent(getActivity(), HomeMade.class);
                    startActivity(intent);
                }else if (position == 5) {
                    Intent intent = new Intent(getActivity(), Pavement.class);
                    startActivity(intent);
                }else if (position == 6) {
                    Intent intent = new Intent(getActivity(), PizzaBurger.class);
                    startActivity(intent);
                }else if (position == 7) {
                    Intent intent = new Intent(getActivity(), Chicken.class);
                    startActivity(intent);
                }else if (position == 8) {
                    Intent intent = new Intent(getActivity(), Pot.class);
                    startActivity(intent);
                }else if (position == 9) {
                    Intent intent = new Intent(getActivity(), Sushi.class);
                    startActivity(intent);
                }else if (position == 10) {
                    Intent intent = new Intent(getActivity(), Noodles.class);
                    startActivity(intent);
                }else if (position == 11) {
                    Intent intent = new Intent(getActivity(), BoxedRice.class);
                    startActivity(intent);
                }
            }
        });

        return view;
    }

}