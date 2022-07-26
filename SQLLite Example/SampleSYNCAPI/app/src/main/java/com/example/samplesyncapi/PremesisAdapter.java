package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PremesisAdapter  extends RecyclerView.Adapter<PremesisViewHolder>{
    List<PremesisType> premesisTypeList;

    PremesisAdapter(List<PremesisType> premesisTypes)
    {
        this.premesisTypeList=premesisTypes;
    }
    @NonNull
    @Override
    public PremesisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.premesis_card_layout, parent, false);
        PremesisViewHolder viewHolder = new PremesisViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PremesisViewHolder holder, int position) {
        holder.premesisId.setText(premesisTypeList.get(position).getPremTypeId());
        holder.premesisName.setText(premesisTypeList.get(position).getPremTypeName());
    }

    @Override
    public int getItemCount() {
        return premesisTypeList.size();
    }
}
