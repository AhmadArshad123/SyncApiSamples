package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SpecieAdapter extends RecyclerView.Adapter<SpecieViewHolder>{
    List<Species> species;

    public SpecieAdapter(List<Species> species) {
        this.species=species;
    }

    @NonNull
    @Override
    public SpecieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.animal_card_layout, parent, false);
        SpecieViewHolder viewHolder = new SpecieViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SpecieViewHolder holder, int position) {
        holder.specieID.setText((CharSequence) species.get(position).getSpecieId());
        holder.specieName.setText(species.get(position).getSpecieName());
        holder.specieCode.setText((CharSequence) species.get(position).getSpecieCode());
        holder.specieIdLabel.setText("Specie ID");
        holder.specieCodeLabel.setText("Specie Code");
        holder.removeLabel.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
        return species.size();
    }
}
