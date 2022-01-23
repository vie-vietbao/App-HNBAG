package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.FoodPopularFragment;
import com.example.demoapphnbag2.ScreenSections.FoodSuggestFragment;

public class ViewPagerAdapterOPSF extends FragmentStateAdapter {
    public ViewPagerAdapterOPSF(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FoodSuggestFragment();
            case 1:
                return new FoodPopularFragment();
            default:
                return new FoodSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
