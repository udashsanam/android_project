package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DashBoardActivity extends AppCompatActivity {

    private Toolbar dashBoardToolBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private ViewPageAdapter viewPageAdder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        initToolbar();
        findViews();
        setUpViewPager();
        // sync tab layout with view pager
        tabLayout.setupWithViewPager(viewPager);
    }

    private void findViews(){

            tabLayout = findViewById(R.id.tab_layout);
            viewPager = findViewById(R.id.view_pager);
    }

    private void initToolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("View Pager ");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    public void setUpViewPager(){

        viewPageAdder = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdder.addFragment(new HomeFragment(), "Home");
        viewPageAdder.addFragment(new DashboardFragment(), "dashboard");
        viewPager.setAdapter(viewPageAdder);

    }

}