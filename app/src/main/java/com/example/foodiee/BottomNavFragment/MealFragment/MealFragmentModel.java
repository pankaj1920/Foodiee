package com.example.foodiee.BottomNavFragment.MealFragment;

public class MealFragmentModel {
    int mealImage;
    String mealDishName;
    String mealDishCategory;
    String mealDishPrice;

    public MealFragmentModel(int mealImage, String mealDishName, String mealDishCategory, String mealDishPrice) {
        this.mealImage = mealImage;
        this.mealDishName = mealDishName;
        this.mealDishCategory = mealDishCategory;
        this.mealDishPrice = mealDishPrice;
    }


    public int getMealImage() {
        return mealImage;
    }

    public void setMealImage(int mealImage) {
        this.mealImage = mealImage;
    }

    public String getMealDishName() {
        return mealDishName;
    }

    public void setMealDishName(String mealDishName) {
        this.mealDishName = mealDishName;
    }

    public String getMealDishCategory() {
        return mealDishCategory;
    }

    public void setMealDishCategory(String mealDishCategory) {
        this.mealDishCategory = mealDishCategory;
    }

    public String getMealDishPrice() {
        return mealDishPrice;
    }

    public void setMealDishPrice(String mealDishPrice) {
        this.mealDishPrice = mealDishPrice;
    }
}
