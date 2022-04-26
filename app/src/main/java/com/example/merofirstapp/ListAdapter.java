package com.example.merofirstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    private List<Product> productList = new ArrayList<>();
    private Context context;

    // context is the activity or fragment where you what to render the content
    public ListAdapter(List<Product> productList, Context mContext) {
        // this is pass by value means if we clear the Product list then product's list will also clear
        this.productList.addAll(productList);
        context = mContext;

//        // pass by values
//        this.productList = productList;

    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int i) {
        return productList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
