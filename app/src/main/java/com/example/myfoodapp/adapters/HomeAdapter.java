package com.example.myfoodapp.adapters;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myfoodapp.R;
import com.example.myfoodapp.models.HomeModel;
import com.example.myfoodapp.models.HomeVerModel;
import java.util.ArrayList;
import java.util.List;

public class HomeAdapter  extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    UpdateVertical updateVertical;
    Activity activity;
    ArrayList<HomeModel> list;


    boolean check = true;
    boolean select = true;
    int row_index = -1;


    public HomeAdapter(UpdateVertical updateVertical, Activity activity, ArrayList<HomeModel> list) {
        this.updateVertical = updateVertical;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza2, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza3, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
            homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza4, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

            updateVertical.callback(position, homeVerModelArrayList);
            check = false;
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();


                if (position == 0) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza1, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza2, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza3, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.pizza4, "Pizza", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

                    updateVertical.callback(position, homeVerModelArrayList);

                } else if (position == 1) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger1, "burger1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger2, "burger1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.burger4, "burger1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

                    updateVertical.callback(position, homeVerModelArrayList);

                } else if (position == 2) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries1, "fries1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries2, "fries1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries3, "fries1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.fries4, "fries1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

                    updateVertical.callback(position, homeVerModelArrayList);

                } else if (position == 3) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream1, "icecream", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream2, "icecream", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream3, "icecream", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.icecream4, "icecream", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

                    updateVertical.callback(position, homeVerModelArrayList);

                } else if (position == 4) {
                    ArrayList<HomeVerModel> homeVerModelArrayList = new ArrayList<>();
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich1, "sandwich1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich2, "sandwich1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich3, "sandwich1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));
                    homeVerModelArrayList.add(new HomeVerModel(R.drawable.sandwich4, "sandwich1", "10:00 - 23:00", "4.9", "Min - 258.000VNĐ"));

                    updateVertical.callback(position, homeVerModelArrayList);

                }
            }
        });
        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_img);
            name = itemView.findViewById(R.id.item_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
