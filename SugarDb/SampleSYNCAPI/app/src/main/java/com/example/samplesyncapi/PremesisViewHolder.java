package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PremesisViewHolder extends RecyclerView.ViewHolder {

    TextView premesisId;
    TextView premesisName;
    public PremesisViewHolder(@NonNull View itemView) {
        super(itemView);
        premesisId=itemView.findViewById(R.id.tv_premesis_id);
        premesisName=itemView.findViewById(R.id.tv_premesis_name);
    }
}
