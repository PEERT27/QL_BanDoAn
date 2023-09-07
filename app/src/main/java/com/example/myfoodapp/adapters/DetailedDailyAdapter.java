package com.example.myfoodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.ArrayList;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder> {
    ArrayList<DetailedDailyModel> arrayList;
    Context context;

    public DetailedDailyAdapter(ArrayList<DetailedDailyModel> arrayList) {
        this.arrayList = arrayList;
    }

    public DetailedDailyAdapter() {
    }

    @NonNull
    @Override
    public DetailedDailyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailedDailyAdapter.ViewHolder holder, int position) {
        DetailedDailyModel model = arrayList.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.description.setText(model.getDescription());
        holder.price.setText(model.getPrice());
        holder.rating.setText(model.getRating());
        holder.timing.setText(model.getTiming());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, price, description, rating, timing;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            price = itemView.findViewById(R.id.detailed_price);
            description = itemView.findViewById(R.id.detailed_description);
            rating = itemView.findViewById(R.id.detailed_rating);
            timing = itemView.findViewById(R.id.detailed_timing);
        }
    }
}
