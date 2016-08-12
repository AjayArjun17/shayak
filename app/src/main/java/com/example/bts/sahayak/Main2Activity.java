package com.example.bts.sahayak;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity implements ActionBar.TabListener{
    ViewPager vp;
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vp = (ViewPager) findViewById(R.id.viewpager);
        Pageadapter Pageadapter = new Pageadapter(getSupportFragmentManager());
        vp.setAdapter(Pageadapter);
        ab = getSupportActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.addTab(ab.newTab().setIcon(R.drawable.homeicon).setTabListener((ActionBar.TabListener) this));
        ab.addTab(ab.newTab().setIcon(R.drawable.formicon).setTabListener((ActionBar.TabListener) this));
        ab.addTab(ab.newTab().setIcon(R.drawable.servicesicon).setTabListener((ActionBar.TabListener) this));
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                ab.setSelectedNavigationItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
        @Override
        public void onTabSelected (ActionBar.Tab tab, FragmentTransaction ft){
            vp.setCurrentItem(tab.getPosition());


        }

        @Override
        public void onTabUnselected (ActionBar.Tab tab, FragmentTransaction ft){

        }

        @Override
        public void onTabReselected (ActionBar.Tab tab, FragmentTransaction ft){

        }
    }


