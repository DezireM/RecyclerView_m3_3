package com.example.recyclerviewm3_3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> productList = new ArrayList<>();
    private RecyclerView rvGrocery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rvGrocery = findViewById(R.id.rv_grocery);
        productList.add("Coffee");
        productList.add("Cheese");
        productList.add("Milk");
        productList.add("Greek Yogurt");
        productList.add("Fruits");
        productList.add("Granola");
        productList.add("Vegetables");
        productList.add("Avocado");
        productList.add("Chocolate");
        productList.add("Fizzy drinks");
        productList.add("Meat");
        productList.add("Soy sauce");
       GroceryAdapter adapter = new GroceryAdapter(productList);
       rvGrocery.setAdapter(adapter);

    }
}