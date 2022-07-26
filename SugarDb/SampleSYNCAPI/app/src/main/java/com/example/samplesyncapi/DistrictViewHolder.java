package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DistrictViewHolder extends RecyclerView.ViewHolder {

    TextView districtId;
    TextView districtName;
    TextView districtCode;
    TextView districtDivision;
    TextView provinceId;

    public DistrictViewHolder(@NonNull View itemView) {
        super(itemView);
        districtId=itemView.findViewById(R.id.tv_district_id);
        districtName=itemView.findViewById(R.id.tv_district_name);
        districtCode=itemView.findViewById(R.id.tv_district_code);
        districtDivision=itemView.findViewById(R.id.tv_division_name);
        provinceId=itemView.findViewById(R.id.tv_district_province_id);
    }
}
