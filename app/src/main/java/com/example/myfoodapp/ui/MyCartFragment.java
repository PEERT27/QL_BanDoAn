package com.example.myfoodapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.CartAdapter;
import com.example.myfoodapp.models.CartModel;

import java.util.ArrayList;


public class MyCartFragment extends Fragment {

    ArrayList<CartModel> arrayList;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        arrayList = new ArrayList<>();
        arrayList.add(new CartModel(R.drawable.s1, "Order 1", "$30", "4.3"));
        arrayList.add(new CartModel(R.drawable.s2, "Order 1", "$70", "4.6"));
        arrayList.add(new CartModel(R.drawable.s3, "Order 1", "$20", "4.3"));
        arrayList.add(new CartModel(R.drawable.s1, "Order 1", "$90", "4.3"));
        arrayList.add(new CartModel(R.drawable.s1, "Order 1", "$10", "4.3"));
        arrayList.add(new CartModel(R.drawable.s1, "Order 1", "$30", "4.3"));

        cartAdapter = new CartAdapter(arrayList);
        recyclerView.setAdapter(cartAdapter);
        return view;
    }
}