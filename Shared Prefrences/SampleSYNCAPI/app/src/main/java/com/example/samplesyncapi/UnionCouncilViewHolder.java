package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UnionCouncilViewHolder extends RecyclerView.ViewHolder {
    TextView unionId;
    TextView unionName;
    TextView unionCode;
    TextView tehsilId;
    public UnionCouncilViewHolder(@NonNull View itemView) {
        super(itemView);
        unionId=itemView.findViewById(R.id.tv_union_id);
        unionName=itemView.findViewById(R.id.tv_union_name);
        unionCode=itemView.findViewById(R.id.tv_union_code);
        tehsilId=itemView.findViewById(R.id.tv_union_tehsil_Id);
    }
}
