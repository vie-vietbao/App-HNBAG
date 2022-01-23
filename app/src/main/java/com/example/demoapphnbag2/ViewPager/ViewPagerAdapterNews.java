package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenNews.CreamCakeNewsFragment;
import com.example.demoapphnbag2.ScreenNews.DrinkNewsFragment;
import com.example.demoapphnbag2.ScreenNews.FoodNewsFragment;
import com.example.demoapphnbag2.ScreenNews.FunctionFoodFragment;
import com.example.demoapphnbag2.ScreenNews.HomeMadeFragment;
import com.example.demoapphnbag2.ScreenNews.HotNewsFragment;
import com.example.demoapphnbag2.ScreenNews.HotPlaceFragment;
import com.example.demoapphnbag2.ScreenNews.JapanFoodFragment;
import com.example.demoapphnbag2.ScreenNews.KoreaFragment;
import com.example.demoapphnbag2.ScreenNews.PizzaNewsFragment;
import com.example.demoapphnbag2.ScreenNews.PotNewsFragment;
import com.example.demoapphnbag2.ScreenNews.RiceNewsFragment;
import com.example.demoapphnbag2.ScreenNews.SnacksFragment;
import com.example.demoapphnbag2.ScreenNews.ThailandFragment;
import com.example.demoapphnbag2.ScreenNews.VegetarianNewsFragment;

public class ViewPagerAdapterNews extends FragmentStateAdapter  {



    public ViewPagerAdapterNews(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HotNewsFragment();
            case 1:
                return new HotPlaceFragment();
            case 2:
                return new FunctionFoodFragment();
            case 3:
                return new JapanFoodFragment();
            case 4:
                return new ThailandFragment();
            case 5:
                return new KoreaFragment();
            case 6:
                return new FoodNewsFragment();
            case 7:
                return new DrinkNewsFragment();
            case 8:
                return new VegetarianNewsFragment();
            case 9:
                return new CreamCakeNewsFragment();
            case 10:
                return new HomeMadeFragment();
            case 11:
                return new SnacksFragment();
            case 12:
                return new PizzaNewsFragment();
            case 13:
                return new PotNewsFragment();
            case 14:
                return new RiceNewsFragment();
            default:
                return new HotNewsFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
