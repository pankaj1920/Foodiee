package com.example.foodiee.BottomNavFragment.MealFragment;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.foodiee.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MealFragment extends Fragment {

    RecyclerView mealRecyclerView;

    public MealFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_meal, container, false);
        mealRecyclerView = (RecyclerView) view.findViewById(R.id.mealRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mealRecyclerView.setLayoutManager(layoutManager);

        ArrayList<MealFragmentModel> foodItem = new ArrayList<>();
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        foodItem.add(new MealFragmentModel(R.drawable.foodimg,"Hyderabad Biryaani","Biryani,Mughlai,South Indian","180.00"));
        MealRecyclerAdapter mealAdapter = new MealRecyclerAdapter(foodItem);
        mealRecyclerView.setAdapter(mealAdapter);
        return view;

    }
}
