package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.HomeMadePopularFragment;
import com.example.demoapphnbag2.ScreenSections.HomeMadeSuggestFragment;

public class ViewPagerAdapterOPSHM extends FragmentStateAdapter {
    public ViewPagerAdapterOPSHM(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeMadeSuggestFragment();
            case 1:
                return new HomeMadePopularFragment();
            default:
                return new HomeMadeSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
