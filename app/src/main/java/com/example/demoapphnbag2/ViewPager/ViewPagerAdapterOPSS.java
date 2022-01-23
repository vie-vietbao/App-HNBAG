package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.SushiPopularFragment;
import com.example.demoapphnbag2.ScreenSections.SushiSuggestFragment;

public class ViewPagerAdapterOPSS extends FragmentStateAdapter {
    public ViewPagerAdapterOPSS(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SushiSuggestFragment();
            case 1:
                return new SushiPopularFragment();
            default:
                return new SushiSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
