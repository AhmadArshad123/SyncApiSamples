package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatAdapter extends RecyclerView.Adapter<StatViewHolder> {
    List<Stat> statList;

    StatAdapter(List<Stat> stats)
    {
        this.statList=stats;
    }

    @NonNull
    @Override
    public StatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.stats_card_layout, parent, false);
        StatViewHolder viewHolder = new StatViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StatViewHolder holder, int position) {
        holder.statName.setText(statList.get(position).getName());
        holder.statCount.setText(statList.get(position).getCount().toString());
    }

    @Override
    public int getItemCount() {
        return statList.size();
    }
}
