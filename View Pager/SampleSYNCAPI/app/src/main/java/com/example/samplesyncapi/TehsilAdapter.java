package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TehsilAdapter extends RecyclerView.Adapter<TehsilViewHolder> {
    List<Tehsil> tehsilList;

    TehsilAdapter(List<Tehsil> tehsils)
    {
        this.tehsilList=tehsils;
    }

    @NonNull
    @Override
    public TehsilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.tehsil_card_layout, parent, false);
        TehsilViewHolder viewHolder = new TehsilViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TehsilViewHolder holder, int position) {
        holder.tehsilId.setText(tehsilList.get(position).getTehsilId());
        holder.tehsilName.setText(tehsilList.get(position).getTehsilName());
        holder.tehsilCode.setText((CharSequence) tehsilList.get(position).getTehsilCode());
        holder.districtId.setText((CharSequence) tehsilList.get(position).getDistrictId());
    }

    @Override
    public int getItemCount() {
        return tehsilList.size();
    }
}
