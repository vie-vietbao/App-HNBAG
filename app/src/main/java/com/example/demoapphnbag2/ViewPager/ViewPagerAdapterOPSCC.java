package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenSections.CreamCakePopularFragment;
import com.example.demoapphnbag2.ScreenSections.CreamCakeSuggestFragment;

public class ViewPagerAdapterOPSCC extends FragmentStateAdapter {
    public ViewPagerAdapterOPSCC(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CreamCakeSuggestFragment();
            case 1:
                return new CreamCakePopularFragment();
            default:
                return new CreamCakeSuggestFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
