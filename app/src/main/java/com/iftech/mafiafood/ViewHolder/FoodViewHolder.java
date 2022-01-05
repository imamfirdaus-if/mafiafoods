package com.iftech.mafiafood.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iftech.mafiafood.Interface.ItemClickListener;
import com.iftech.mafiafood.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView food_name;
    public TextView food_price;
    public ImageView food_image;

    private ItemClickListener itemClickListener;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        food_name = itemView.findViewById(R.id.food_name);
        food_image = itemView.findViewById(R.id.food_image);
        food_price = itemView.findViewById(R.id.food_price);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onCLick(v, getAdapterPosition(), false);
    }
}
