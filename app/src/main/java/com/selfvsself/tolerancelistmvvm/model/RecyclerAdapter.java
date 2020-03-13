package com.selfvsself.tolerancelistmvvm.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.selfvsself.tolerancelistmvvm.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    List<SizeWithTolerance> itemList;

    public RecyclerAdapter(List<SizeWithTolerance> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SizeWithTolerance item = itemList.get(position);
        holder.sizeText.setText(String.valueOf(item.getSize()));
        holder.tolText.setText(item.getTolerance().toString());
        holder.upTolText.setText(String.valueOf(item.getUpperTolerance()));
        holder.lowTolText.setText(String.valueOf(item.getLowerTolerance()));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView sizeText, tolText, upTolText, lowTolText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            sizeText = itemView.findViewById(R.id.textViewRecItemSize);
            tolText = itemView.findViewById(R.id.textViewRecItemTolerance);
            upTolText = itemView.findViewById(R.id.textViewRecItemUpperTolerance);
            lowTolText = itemView.findViewById(R.id.textViewRecItemLowerTolerance);
        }
    }
}
