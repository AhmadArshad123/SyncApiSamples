package com.example.samplesyncapi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VillageViewHolder extends RecyclerView.ViewHolder {
    TextView villageId;
    TextView villageName;
    TextView villageCode;
    TextView unionId;
    public VillageViewHolder(@NonNull View itemView) {
        super(itemView);
        villageId=itemView.findViewById(R.id.tv_village_id);
        villageName=itemView.findViewById(R.id.tv_village_name);
        villageCode=itemView.findViewById(R.id.tv_village_code);
        unionId=itemView.findViewById(R.id.tv_union_council_village_Id);
    }
}
