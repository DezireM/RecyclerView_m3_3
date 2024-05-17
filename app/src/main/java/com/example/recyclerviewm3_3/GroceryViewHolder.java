package com.example.recyclerviewm3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvGrocery;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGrocery = itemView.findViewById(R.id.tv_Grocery);
    }
    public void OnBind(String productName){
        tvGrocery.setText(productName);
    }

}
