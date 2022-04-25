package com.example.merofirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

public class CategoryActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initToolBar();
        getSupportFragmentManager().beginTransaction().add(R.id.frame1, new DashboardFragment()).commit();

    }

    private void initToolBar(){

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fragment layout ");
        // display back bottom in the tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }

    // action for the tool bar items
    //
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // getting the item from the tool bar
        if(item.getItemId() == android.R.id.home){
            // this will remove the previous fragment and add new in the frame layout
            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, new HomeFragment()).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}