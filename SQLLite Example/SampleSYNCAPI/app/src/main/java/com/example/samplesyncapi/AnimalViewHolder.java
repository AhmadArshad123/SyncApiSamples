package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplesyncapi.R;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    TextView animalTypeID;
    TextView animalTypeName;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        animalTypeID=itemView.findViewById(R.id.tv_animal_id);
        animalTypeName=itemView.findViewById(R.id.tv_animal_type);
    }
}
