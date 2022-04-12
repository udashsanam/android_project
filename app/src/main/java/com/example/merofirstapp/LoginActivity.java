package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
//    activity life cycle
//    1. onCreate  when activity crate
//    2. onStart   when activity launched
//    3. onPause   pause when the another activity is created or launched
//    4. onResume  after the activity start from the pause state
//    5. onDestroy  activity when the activity killed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        link between layout and activity file
        setContentView(R.layout.layout_login);
        initToolBar();

    }


    // code for the tool bar
    private void initToolBar(){
        // R specify the resource file
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("New Mero First App");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }
}