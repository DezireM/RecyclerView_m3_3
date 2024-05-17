package com.example.recyclerviewm3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {
    private ArrayList<String> productList;

    public GroceryAdapter(ArrayList<String> productList) {
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grocery,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.OnBind(productList.get(position));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
