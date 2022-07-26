package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpecieViewHolder extends RecyclerView.ViewHolder{
    TextView specieID;
    TextView specieName;
    TextView specieCode;
    TextView specieIdLabel;
    TextView specieCodeLabel;
    TextView removeLabel;

    public SpecieViewHolder(@NonNull View itemView) {
        super(itemView);
        specieID=itemView.findViewById(R.id.tv_animal_id);
        specieName=itemView.findViewById(R.id.tv_animal_type);
        specieCode=itemView.findViewById(R.id.tv_animal_color);
        specieIdLabel=itemView.findViewById(R.id.tv_id_label);
        specieCodeLabel=itemView.findViewById(R.id.tv_color_label);
        removeLabel=itemView.findViewById(R.id.tv_animal_status);
    }
}
