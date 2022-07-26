package com.example.samplesyncapi;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder>{
    List<AnimalType> animals;

    public AnimalAdapter(List<AnimalType> animals) {
        this.animals=animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.animal_card_layout, parent, false);
        AnimalViewHolder viewHolder = new AnimalViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.animalTypeID.setText(animals.get(position).getAnimalTypeId());
        holder.animalTypeName.setText((CharSequence) animals.get(position).getAnimalTypeName());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
