package com.example.scheduler;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class DayRecyclerViewAdapter extends RecyclerView.Adapter{

    private String[] localDayAtivities;

    public class DayRecyclerViewHolder extends  RecyclerView.ViewHolder{
        public DayRecyclerViewHolder(View viewItem){
            super(viewItem);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return localDayAtivities.length;
    }
}
