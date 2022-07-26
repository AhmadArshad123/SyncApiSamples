package com.example.samplesyncapi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PremesisPage extends Fragment {
    public PremesisPage() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.premesis_type_page, container, false);
        List<PremesisType> premesisTypes= PremesisType.listAll(PremesisType.class);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_premesis_types);
        PremesisAdapter premesisAdapter = new PremesisAdapter(premesisTypes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(premesisAdapter);
        return view;
    }
}
