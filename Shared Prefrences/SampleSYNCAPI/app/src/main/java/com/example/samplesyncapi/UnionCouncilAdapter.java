package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UnionCouncilAdapter extends RecyclerView.Adapter<UnionCouncilViewHolder> {


    List<UnionCouncil> unionCouncilList;
    UnionCouncilAdapter(List<UnionCouncil> unionCouncils)
    {
        this.unionCouncilList=unionCouncils;
    }

    @NonNull
    @Override
    public UnionCouncilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.union_council_card_layout, parent, false);
        UnionCouncilViewHolder viewHolder = new UnionCouncilViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UnionCouncilViewHolder holder, int position) {
        holder.unionId.setText(unionCouncilList.get(position).getUnionId());
        holder.unionName.setText(unionCouncilList.get(position).getUnionName());
        holder.unionCode.setText((CharSequence) unionCouncilList.get(position).getUnionCode());
        holder.tehsilId.setText((CharSequence) unionCouncilList.get(position).getTehsilId());
    }

    @Override
    public int getItemCount() {
        return unionCouncilList.size();
    }
}
