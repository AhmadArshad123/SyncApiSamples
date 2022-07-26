package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplesyncapi.R;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    TextView animalID;
    TextView animalType;
    TextView animalColor;
    TextView animalStatus;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        animalID=itemView.findViewById(R.id.tv_animal_id);
        animalType=itemView.findViewById(R.id.tv_animal_type);
        animalColor=itemView.findViewById(R.id.tv_animal_color);
        animalStatus=itemView.findViewById(R.id.tv_animal_status);
    }
}
