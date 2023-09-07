package com.example.myfoodapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.HomeAdapter;
import com.example.myfoodapp.adapters.HomeVerAdapter;
import com.example.myfoodapp.adapters.UpdateVertical;
import com.example.myfoodapp.models.HomeModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVertical {



    RecyclerView home_rec,home_ver_rec;
    ArrayList<HomeModel> homeModelList;

    HomeAdapter homeAdapter;

    /////////////////////////////////vertical//////////////////////////////
    ArrayList<HomeVerModel> homeVerModels;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home, container,false);

        home_rec = root.findViewById(R.id.home_item);
        home_ver_rec = root.findViewById(R.id.home_ver);

        homeModelList = new ArrayList<>();
        homeModelList.add(new HomeModel(R.drawable.pizza,"Pizza"));
        homeModelList.add(new HomeModel(R.drawable.hamburger,"Hamburger"));
        homeModelList.add(new HomeModel(R.drawable.fried_potatoes,"Fries"));
        homeModelList.add(new HomeModel(R.drawable.ice_cream,"Ice Cream"));
        homeModelList.add(new HomeModel(R.drawable.sandwich,"Sandwich"));
        homeAdapter = new HomeAdapter(this,getActivity(),homeModelList);
        home_rec.setAdapter(homeAdapter);
        home_rec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        home_rec.setHasFixedSize(true);
        home_rec.setNestedScrollingEnabled(false);


        /////////////////////////////////vertical//////////////////////////////
        homeVerModels = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModels);
        home_ver_rec.setAdapter(homeVerAdapter);
        home_ver_rec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));


        return root;
    }

    @Override
    public void callback(int pos, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        home_ver_rec.setAdapter(homeVerAdapter);

    }
}