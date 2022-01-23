package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.DrinkPopularFragment;
import com.example.demoapphnbag2.ScreenSections.DrinkSuggestFragment;

public class ViewPagerAdapterOPSD extends FragmentStateAdapter {
    public ViewPagerAdapterOPSD(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new DrinkSuggestFragment();
            case 1:
                return new DrinkPopularFragment();
            default:
                return new DrinkSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
