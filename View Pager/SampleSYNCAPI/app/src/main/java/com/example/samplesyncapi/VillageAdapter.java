package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VillageAdapter extends RecyclerView.Adapter<VillageViewHolder> {
    List<Village> villageList;

    VillageAdapter(List<Village> villages)
    {
        this.villageList=villages;
    }

    @NonNull
    @Override
    public VillageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.villages_card_layout, parent, false);
        VillageViewHolder viewHolder = new VillageViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VillageViewHolder holder, int position) {
        holder.villageId.setText(villageList.get(position).getVillageId());
        holder.villageName.setText(villageList.get(position).getVillageName());
        holder.villageCode.setText((CharSequence) villageList.get(position).getVillageCode());
        holder.unionId.setText((CharSequence) villageList.get(position).getUnionCouncilId());
    }

    @Override
    public int getItemCount() {
        return villageList.size();
    }
}
