package com.example.merofirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
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
    }
}