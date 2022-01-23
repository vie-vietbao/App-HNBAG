package com.example.demoapphnbag2.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demoapphnbag2.ScreenDrops.AdviceFragment;
import com.example.demoapphnbag2.ScreenDrops.ComingSoonFragment;
import com.example.demoapphnbag2.ScreenDrops.FavoriteFragment;

public class ViewPagerAdapterDrops extends FragmentStateAdapter {
    public ViewPagerAdapterDrops(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ComingSoonFragment();
            case 1:
                return new AdviceFragment();
            case 2:
                return new FavoriteFragment();
            default:
                return new ComingSoonFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
