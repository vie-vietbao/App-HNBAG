package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.PotPopularFragment;
import com.example.demoapphnbag2.ScreenSections.PotSuggestFragment;

public class ViewPagerAdapterOPSPot extends FragmentStateAdapter {
    public ViewPagerAdapterOPSPot(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PotSuggestFragment();
            case 1:
                return new PotPopularFragment();
            default:
                return new PotSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
