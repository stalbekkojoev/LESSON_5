package com.example.lesson_5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> list;


    public NameAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
