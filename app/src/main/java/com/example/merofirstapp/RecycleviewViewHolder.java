package com.example.merofirstapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleviewViewHolder extends RecyclerView.ViewHolder{

    public TextView txtTitle, txtDesc, txtPrice, txtQuantity;


    public RecycleviewViewHolder(@NonNull View itemView) {
        super(itemView);

        txtTitle = itemView.findViewById(R.id.textProductTitle);
        txtDesc = itemView.findViewById(R.id.textProductDescription);
        txtQuantity = itemView.findViewById(R.id.unit);
        txtPrice = itemView.findViewById(R.id.price);
    }
}
