package com.example.merofirstapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewData = layoutInflater.inflate(R.layout.adapter_product_layout, null);
        ViewHolder holder  = new ViewHolder(viewData);
        holder.txtPrice.setText(productList.get(position).getTitle());
        holder.txtUnit.setText(productList.get(position).getUnit());
        holder.txtDescription.setText(productList.get(position).getDescription());
        holder.textTitle.setText(productList.get(position).getTitle());

        return viewData;
    }

    public static class ViewHolder{
        private TextView textTitle, txtDescription, txtUnit, txtPrice;

        public ViewHolder(View view) {
            textTitle = view.findViewById(R.id.textProductTitle);
            txtDescription = view.findViewById(R.id.textProductDescription);
            txtUnit = view.findViewById(R.id.unit);
            txtPrice = view.findViewById(R.id.price);
        }
    }
}
