package com.example.samplesyncapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProvinceAdapter  extends RecyclerView.Adapter<ProvinceViewHolder>{
    List<Province> provinceList;

    ProvinceAdapter(List<Province> provinces)
    {
        this.provinceList=provinces;
    }
    @NonNull
    @Override
    public ProvinceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.provinces_card_layout, parent, false);
        ProvinceViewHolder viewHolder = new ProvinceViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinceViewHolder holder, int position) {
        holder.provinceId.setText(provinceList.get(position).getProvinceId());
        holder.provinceName.setText(provinceList.get(position).getProvinceName());
        holder.provinceCode.setText((CharSequence) provinceList.get(position).getProvinceCode());
        holder.country.setText((CharSequence) provinceList.get(position).getContry());
    }

    @Override
    public int getItemCount() {
        return provinceList.size();
    }
}
