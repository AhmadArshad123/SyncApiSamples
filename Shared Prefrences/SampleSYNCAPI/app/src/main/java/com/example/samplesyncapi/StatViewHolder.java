package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StatViewHolder extends RecyclerView.ViewHolder {
    TextView statName;
    TextView statCount;
    public StatViewHolder(@NonNull View itemView) {
        super(itemView);
        statName=itemView.findViewById(R.id.tv_stat_name);
        statCount=itemView.findViewById(R.id.tv_stat_count);
    }
}
