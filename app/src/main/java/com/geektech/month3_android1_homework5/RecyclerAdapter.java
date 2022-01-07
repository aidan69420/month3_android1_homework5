package com.geektech.month3_android1_homework5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<Model> list;
    public Listener listener;

    public void setListener (ArrayList<Model> models, Listener listener) {
        this.list = models;
        this.listener = listener;
        this.list.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView musicExecutor;
        private TextView musicName;
        private TextView numbers;
        private TextView numbersMusic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            musicExecutor = itemView.findViewById(R.id.musicExecutor);
            musicName = itemView.findViewById(R.id.musicName);
            numbers = itemView.findViewById(R.id.numbers);
            numbersMusic = itemView.findViewById(R.id.numbersMusic);
        }
        public void onBind(Model title){
            this.musicExecutor.setText(title.getMusicExecutor());
            this.musicName.setText(title.getMusicName());
            this.numbers.setText(title.getNumbers());
            this.numbersMusic.setText(title.getNumbersMusic());
            itemView.setOnClickListener(v -> {
                listener.onClick(title);
            });
        }
    }
}
