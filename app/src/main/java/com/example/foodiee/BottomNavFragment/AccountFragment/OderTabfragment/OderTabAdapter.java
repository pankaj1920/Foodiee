package com.example.foodiee.BottomNavFragment.AccountFragment.OderTabfragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class OderTabAdapter extends FragmentStatePagerAdapter {

    int tanCount;

    public OderTabAdapter(FragmentManager fm, int tanCount) {
        super(fm);
        this.tanCount = tanCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                OnGoingOderFragment oderFragment = new OnGoingOderFragment();
                return oderFragment;
            case 1:
                PastOderFragment pastOderFragment = new PastOderFragment();
                return pastOderFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tanCount;
    }
}
