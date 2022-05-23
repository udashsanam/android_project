package com.example.merofirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleviewViewHolder> {

    List<Product> productList = new ArrayList<>();
    Context mContext;

    RecycleViewAdapter(List<Product> products, Context context){
        this.productList.addAll(products);
        this.mContext = context;
    }
    @NonNull
    @Override
    public RecycleviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_grid_view, parent, false);
        return new RecycleviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleviewViewHolder holder, int position) {
        holder.txtPrice.setText(productList.get(position).getTitle());
        holder.txtQuantity.setText(productList.get(position).getUnit());
        holder.txtDesc.setText(productList.get(position).getDescription());
        holder.txtTitle.setText(productList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
