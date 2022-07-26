package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProvinceViewHolder extends RecyclerView.ViewHolder {
    TextView provinceId;
    TextView provinceName;
    TextView provinceCode;
    TextView country;
    public ProvinceViewHolder(@NonNull View itemView) {
        super(itemView);
        provinceId=itemView.findViewById(R.id.tv_province_id);
        provinceName=itemView.findViewById(R.id.tv_province_name);
        provinceCode=itemView.findViewById(R.id.tv_province_code);
        country=itemView.findViewById(R.id.tv_country_name);
    }
}
