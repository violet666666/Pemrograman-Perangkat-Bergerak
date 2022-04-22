package com.example.utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private  void getData(){
        namaMakanan.add("Beef Bulgogi");
        fotoMakanan.add("drawable/beefbulgogi.jpg");

        namaMakanan.add("Fried Chicken");
        fotoMakanan.add("drawable/friedchicken.avif");

        namaMakanan.add("Kimchi");
        fotoMakanan.add("drawable/kimchi.jpeg");

        prosesRecyclerViewAdapter();
    }

}