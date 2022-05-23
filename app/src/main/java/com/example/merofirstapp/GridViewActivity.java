package com.example.merofirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private GridView gridView;
    private ListAdapter listAdapter;
    private List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        initToolBar();
        setData();
        findViews();
//        getSupportFragmentManager().beginTransaction().add(R.id.frame1, new DashboardFragment()).commit();

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
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        // getting the item from the tool bar
//        if(item.getItemId() == android.R.id.home){
//            // this will remove the previous fragment and add new in the frame layout
//            getSupportFragmentManager().beginTransaction().replace(R.id.frame1, new HomeFragment()).commit();
//        }
//        return super.onOptionsItemSelected(item);
//    }

    public void findViews(){

        gridView = findViewById(R.id.grid_view);
        // this means object of this class i.e activity or fragment
        listAdapter = new ListAdapter(productList, this);

        gridView.setAdapter(listAdapter);
    }

    private void setData(){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        p1.setTitle("Iphone 6");
        p2.setTitle("Iphone 7");
        p3.setTitle("Iphone 8");
        p4.setTitle("Iphone 9");
        p1.setDescription("this is iphone 6 ");
        p2.setDescription("this is iphone 7 ");
        p3.setDescription("this is iphone 8 ");
        p4.setDescription("this is iphone 9 ");
        p1.setPrice("234");
        p2.setPrice("234");
        p3.setPrice("234");
        p4.setPrice("234");
        p1.setUnit("45");
        p2.setUnit("46");
        p3.setUnit("56");
        p4.setUnit("467");

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);



    }
}