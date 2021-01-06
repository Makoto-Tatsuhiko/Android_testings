package com.example.androidassignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyWagashiData[] myWagashiData = new MyWagashiData[]{
                new MyWagashiData("Mochi","All over Japan",R.drawable.mochi),
                new MyWagashiData("Manju","All over Japan",R.drawable.manju),
                new MyWagashiData("Momiji Manju","All over Japan",R.drawable.momiji),
                new MyWagashiData("Mizu Manju","All over Japan",R.drawable.mizumanju),
                new MyWagashiData("Dango","All over Japan",R.drawable.dango),
                new MyWagashiData("Taiyaki","All over Japan",R.drawable.taiyaki),
                new MyWagashiData("Dorayaki","All over Japan",R.drawable.dorayaki),
        };

        MyWagashiAdapter myWagashiAdapter = new MyWagashiAdapter(myWagashiData,MainActivity.this);
        recyclerView.setAdapter(myWagashiAdapter);

    }



}
