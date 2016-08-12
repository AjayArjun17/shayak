package com.example.bts.sahayak;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pageadapter extends FragmentPagerAdapter {
    public Pageadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Formicon();

            case 1:
                return new Serviceicon();
            case 2:
                return new Homeicon();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}


