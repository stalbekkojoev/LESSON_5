package com.example.lesson_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NameAdapter adapter;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        names=new ArrayList<>();
        names.add("Beka");
        names.add("Beka");
        names.add("Beka");
        names.add("Beka");
        names.add("Beka");
        names.add("Beka");
        names.add("Beka");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        names.add("Stalbek");
        adapter=new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}