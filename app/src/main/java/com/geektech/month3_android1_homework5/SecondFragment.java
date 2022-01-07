package com.geektech.month3_android1_homework5;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements Listener {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<Model> models;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        models = new ArrayList<>();

        models.add(new Model("Blank Space","Taylor Swift", "1", "3:22"));
        models.add(new Model("Watch Me","Silento", "2", "5:36"));
        models.add(new Model("Earned It","The Weekend", "3", "4:51"));
        models.add(new Model("The Hills","The Weekend", "4", "3:41"));
        models.add(new Model("Writing’s On The Wall","Taylor Swift", "5", "5:33"));

        recyclerView = view.findViewById(R.id.recycler);
        recyclerAdapter  = new RecyclerAdapter();
        recyclerAdapter.setListener(models, this);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void onClick(Model model) {
        Intent intent = new Intent(getActivity(), MainActivity2.class);
        intent.putExtra("name", model.getMusicName());
        startActivity(intent);
    }
}