package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.RicePopularFragment;
import com.example.demoapphnbag2.ScreenSections.RiceSuggestFragment;

public class ViewPagerAdapterOPSBR extends FragmentStateAdapter {
    public ViewPagerAdapterOPSBR(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RiceSuggestFragment();
            case 1:
                return new RicePopularFragment();
            default:
                return new RiceSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
