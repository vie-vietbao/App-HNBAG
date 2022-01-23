package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.PizzaPopularFragment;
import com.example.demoapphnbag2.ScreenSections.PizzaSuggestFragment;

public class ViewPagerAdapterOPSPB extends FragmentStateAdapter {
    public ViewPagerAdapterOPSPB(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PizzaSuggestFragment();
            case 1:
                return new PizzaPopularFragment();
            default:
                return new PizzaSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
