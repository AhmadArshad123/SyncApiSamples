package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BreedAdapter  extends RecyclerView.Adapter<BreedViewHolder> {
    List<Breed> breedList;

    BreedAdapter(List<Breed> breeds)
    {
        this.breedList=breeds;
    }
    @NonNull
    @Override
    public BreedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.breed_card_layout, parent, false);
        BreedViewHolder viewHolder = new BreedViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BreedViewHolder holder, int position) {
        holder.breedId.setText(breedList.get(position).getBreedId());
        holder.breedName.setText(breedList.get(position).getBreedName());
        holder.breedCode.setText((CharSequence) breedList.get(position).getBreedCode());
        holder.specieId.setText((CharSequence) breedList.get(position).getSpecieId());
    }

    @Override
    public int getItemCount() {
        return breedList.size();
    }
}
