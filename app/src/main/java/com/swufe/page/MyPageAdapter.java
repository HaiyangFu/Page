package com.swufe.page;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    private String [] title = new String[]{"First","Second","Third"};
    public MyPageAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else if(position==1){
            return new SecondFragment();
        }else
            return new ThirdFragment();

    }

    @Override
    public CharSequence getPageTitle(int position){
        return title[position];
    }
    public int getCount() {
        return 3;
    }
}
