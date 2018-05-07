package com.example.aria_nazaralizadeh.meditation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by aria-nazaralizadeh on 02/16/2018.
 */

public class fragment_mainactivity_adaptor extends FragmentStatePagerAdapter {
    public fragment_mainactivity_adaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position){
            case 0:
                returnFragment= FragmentMeditate_teachers.newInstance();
                break;
            case 1:
                returnFragment= FragmentMeditate_series.newInstance();
                break;
            case 2:
                returnFragment= FragmentMeditate_Now.newInstance();
                break;

                default:return null;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title="";
        switch (position){
            case 0:
                title="مشاوران";
                break;
            case 1:
                title="دوره ها";
                break;
            case 2:
                title="همین الان";
                break;
        }
        return title;
    }
}
