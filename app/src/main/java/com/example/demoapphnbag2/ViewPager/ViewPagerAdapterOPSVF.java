package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.VegetarianPopularFragment;
import com.example.demoapphnbag2.ScreenSections.VegetarianSuggestFragment;

public class ViewPagerAdapterOPSVF extends FragmentStateAdapter {
    public ViewPagerAdapterOPSVF(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new VegetarianSuggestFragment();
            case 1:
                return new VegetarianPopularFragment();
            default:
                return new VegetarianSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
