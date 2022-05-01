package com.example.merofirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class DashBoardActivity extends AppCompatActivity {

    private Toolbar dashBoardToolBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private ViewPageAdapter viewPageAdder;
    private String usernameIntent;
    private String passwordIntent;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        initToolbar();
        findViews();
        setUpViewPager();
        usernameIntent = getIntent().getStringExtra("Username");
        passwordIntent = getIntent().getStringExtra("Password");
        Log.d("Data", usernameIntent + passwordIntent);
//        Log.d("Object", listView.toString());
        Toast.makeText(DashBoardActivity.this, "username:" + usernameIntent + "password: "+ passwordIntent, Toast.LENGTH_LONG).show();
        // sync tab layout with view pager
        tabLayout.setupWithViewPager(viewPager);
    }

    private void findViews(){

            tabLayout = findViewById(R.id.tab_layout);
            viewPager = findViewById(R.id.view_pager);
            listView = findViewById(R.id.listView);

    }

    private void initToolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("View Pager ");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.home){

        }

        return true;
    }

    public void setUpViewPager(){

        // adding fragment of the view pager of the
        viewPageAdder = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdder.addFragment(new HomeFragment(), "Home");
        viewPageAdder.addFragment(new DashboardFragment(), "Dashboard");
        viewPager.setAdapter(viewPageAdder);

    }

}