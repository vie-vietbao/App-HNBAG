package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.ChickenPopularFragment;
import com.example.demoapphnbag2.ScreenSections.ChickenSuggestFragment;


public class ViewPagerAdapterOPSC extends FragmentStateAdapter {
    public ViewPagerAdapterOPSC(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChickenSuggestFragment();
            case 1:
                return new ChickenPopularFragment();
            default:
                return new ChickenSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
