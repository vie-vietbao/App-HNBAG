package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.NoodlesPopularFragment;
import com.example.demoapphnbag2.ScreenSections.NoodlesSuggestFragment;

public class ViewPagerAdapterOPSNd extends FragmentStateAdapter {
    public ViewPagerAdapterOPSNd(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NoodlesSuggestFragment();
            case 1:
                return new NoodlesPopularFragment();
            default:
                return new NoodlesSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
