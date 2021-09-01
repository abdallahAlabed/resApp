package com.example.taskmaster;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskmaster.database.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishAdaptear extends RecyclerView.Adapter<DishAdaptear.DishViewHolder>{
    List<Dish> allDish = new ArrayList<Dish>();

    public DishAdaptear(List<Dish> allDish) {
        this.allDish = allDish;
    }
    public static class DishViewHolder extends RecyclerView.ViewHolder {

        public DishViewHolder dishViewHolder;
        public Dish dish;
        View itemView;

        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }

    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dishs_list,parent,false);
        DishViewHolder dishViewHolder = new DishViewHolder(view);
        return dishViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        holder.dish = allDish.get(position);

        TextView name = holder.itemView.findViewById(R.id.nameOfDish);
        TextView price = holder.itemView.findViewById(R.id.priceOfDish);
        TextView ingredients = holder.itemView.findViewById(R.id.ingredientsOfDidsh);

        name.setText(holder.dish.name);
        price.setText(holder.dish.price);
        ingredients.setText(holder.dish.ingredients);
    }

    @Override
    public int getItemCount() {
        return allDish.size();    }



}
