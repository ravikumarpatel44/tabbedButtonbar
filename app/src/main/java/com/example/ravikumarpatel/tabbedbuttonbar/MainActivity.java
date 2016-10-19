package com.example.ravikumarpatel.tabbedbuttonbar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        viewPager=(ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new fragment_page_adapter(getSupportFragmentManager(),this));

        tabLayout =(TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);


    }
}
