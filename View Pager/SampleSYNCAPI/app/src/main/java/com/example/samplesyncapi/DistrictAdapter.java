package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DistrictAdapter extends RecyclerView.Adapter<DistrictViewHolder>{
    List<District> districtList;

    DistrictAdapter(List<District> districts)
    {
        this.districtList=districts;
    }
    @NonNull
    @Override
    public DistrictViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.district_card_layout, parent, false);
        DistrictViewHolder viewHolder = new DistrictViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DistrictViewHolder holder, int position) {
        holder.districtId.setText(districtList.get(position).getDistrictId());
        holder.districtName.setText(districtList.get(position).getDistrictName());
        holder.districtCode.setText((CharSequence) districtList.get(position).getDistrictCode());
        holder.districtDivision.setText((CharSequence) districtList.get(position).getDivision());
        holder.provinceId.setText((CharSequence) districtList.get(position).getProvinceId());
    }

    @Override
    public int getItemCount() {
        return districtList.size();
    }
}
