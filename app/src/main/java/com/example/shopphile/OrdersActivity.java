package com.example.shopphile;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrdersActivity extends AppCompatActivity {

    private ImageView backButton;
    private RecyclerView recyclerView;
    private OrderAdapter orderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders);

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> finish()); // Closes current activity

        recyclerView = findViewById(R.id.recycler_view_order_history);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // RETRIEVE FROM DATABASE

        // orderAdapter = new OrderAdapter();
        // recyclerView.setAdapter(orderAdapter);
    }
}
