package com.example.scheduler.recyclerViewClasses;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.scheduler.DayItem;
import com.example.scheduler.R;

import java.time.LocalDateTime;
import java.util.List;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {
    private List<DayItem> list;

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txt01;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txt01 = (TextView) v.findViewById(R.id.textView);
        }
    }

    public void addItem(LocalDateTime localDateTime, String text1, Color color){
        list.add(new DayItem(localDateTime,text1,color));
    }


    @NonNull
    @Override
    public DayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DayAdapter.ViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
