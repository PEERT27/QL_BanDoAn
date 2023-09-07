package com.example.myfoodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.CartModel;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    ArrayList<CartModel> arrayList;

    public CartAdapter(ArrayList<CartModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        CartModel model = arrayList.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.rating.setText(model.getRating());
        holder.price.setText(model.getPrice());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, rating, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            rating = itemView.findViewById(R.id.detailed_rating);
            price = itemView.findViewById(R.id.textView8);
        }
    }
}
