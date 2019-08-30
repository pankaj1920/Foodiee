package com.example.foodiee.BottomNavFragment.MealFragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodiee.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MealRecyclerAdapter extends RecyclerView.Adapter<MealRecyclerAdapter.MR_VH> {

    ArrayList<MealFragmentModel> foodItem;

    public MealRecyclerAdapter(ArrayList<MealFragmentModel> foodItem) {
        this.foodItem = foodItem;
    }

    @NonNull
    @Override
    public MR_VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_recycler_items, parent, false);
        return new MR_VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MR_VH holder, int position) {
        holder.mealImage.setImageResource(foodItem.get(position).getMealImage());
        holder.mealDishName.setText(foodItem.get(position).getMealDishName());
        holder.mealDishCategory.setText(foodItem.get(position).getMealDishCategory());
        holder.mealDishPrice.setText(foodItem.get(position).getMealDishPrice());

    }

    @Override
    public int getItemCount() {
        return foodItem.size();
    }

    public class MR_VH extends RecyclerView.ViewHolder {

        CircleImageView mealImage;
        Button mealAddBtn;
        TextView mealDishName, mealDishCategory, mealDishPrice;

        public MR_VH(@NonNull View itemView) {
            super(itemView);
            mealImage = (CircleImageView) itemView.findViewById(R.id.mealImage);
            mealDishName = (TextView) itemView.findViewById(R.id.mealDishName);
            mealDishCategory = (TextView) itemView.findViewById(R.id.mealDishCategory);
            mealDishPrice = (TextView) itemView.findViewById(R.id.mealDishPrice);
            mealAddBtn = (Button) itemView.findViewById(R.id.mealAddBtn);


            mealAddBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //before inflating the custom alert dialog layout, we will get the current activity viewgroup
                    ViewGroup viewGroup = view.findViewById(android.R.id.content);

                    //then we will inflate the custom alert dialog xml that we created
                    View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.activity_add_food_dialog_box, viewGroup, false);


                    //Now we need an AlertDialog.Builder object
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                    //setting the view of the builder to our custom view that we already inflated
                    builder.setView(dialogView);

                    //finally creating the alert dialog and displaying it
                    final AlertDialog alertDialog = builder.create();
                    //add this line to make your dialogbox radius round
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));

                    alertDialog.show();
                }
            });
        }
    }


}
