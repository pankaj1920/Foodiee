package com.example.foodiee.BottomNavFragment.AccountFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.foodiee.BottomNavFragment.AccountFragment.OderTabfragment.OderTabAdapter;
import com.example.foodiee.R;
import com.google.android.material.tabs.TabLayout;

public class OderActivity extends AppCompatActivity {

    ViewPager oderViewPager;
    TabLayout oderTablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);

        oderTablayout = (TabLayout) findViewById(R.id.oderTablayout);

        oderTablayout.addTab(oderTablayout.newTab().setText("Ongoing Oders"));
        oderTablayout.addTab(oderTablayout.newTab().setText("Past Oders"));

        oderViewPager = (ViewPager) findViewById(R.id.oderViewPager);

        OderTabAdapter tabAdapter = new OderTabAdapter(getSupportFragmentManager(), oderTablayout.getTabCount());
        oderViewPager.setAdapter(tabAdapter);

        oderViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(oderTablayout));

        oderTablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                oderViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
