package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BreedViewHolder extends RecyclerView.ViewHolder {

    TextView breedId;
    TextView breedName;
    TextView breedCode;
    TextView specieId;
    public BreedViewHolder(@NonNull View itemView) {
        super(itemView);
        breedId=itemView.findViewById(R.id.tv_breed_id);
        breedName=itemView.findViewById(R.id.tv_breed_name);
        breedCode=itemView.findViewById(R.id.tv_breed_code);
        specieId=itemView.findViewById(R.id.tv_specie_code);
    }
}
