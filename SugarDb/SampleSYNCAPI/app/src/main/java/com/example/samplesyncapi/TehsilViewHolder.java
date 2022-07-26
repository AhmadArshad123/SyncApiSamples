package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TehsilViewHolder extends RecyclerView.ViewHolder {
    TextView tehsilId;
    TextView tehsilName;
    TextView tehsilCode;
    TextView districtId;
    public TehsilViewHolder(@NonNull View itemView) {
        super(itemView);
        tehsilId=itemView.findViewById(R.id.tv_tehsil_id);
        tehsilName=itemView.findViewById(R.id.tv_tehsil_name);
        tehsilCode=itemView.findViewById(R.id.tv_tehsil_code);
        districtId=itemView.findViewById(R.id.tv_tehsil_district_id);
    }
}
