package com.boltx.stack;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MainPageAdaptor extends FragmentPagerAdapter {

    public MainPageAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AnalyticsFragment();
            case 1:
                return new ViewFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }



    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Analytics";
            case 1:
                return "Receipts";
                default:
                    return null;
        }
    }
}
