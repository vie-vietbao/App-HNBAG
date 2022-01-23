package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.PavementPopularFragment;
import com.example.demoapphnbag2.ScreenSections.PavementSuggestFragment;

public class ViewPagerAdapterOPSP extends FragmentStateAdapter {
    public ViewPagerAdapterOPSP(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PavementSuggestFragment();
            case 1:
                return new PavementPopularFragment();
            default:
                return new PavementSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
