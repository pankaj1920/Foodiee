package com.example.foodiee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodiee.BottomNavFragment.AccountFragment.AccountFragment;
import com.example.foodiee.BottomNavFragment.FavFragment.FavFragment;
import com.example.foodiee.BottomNavFragment.MealFragment.MealFragment;
import com.example.foodiee.BottomNavFragment.CartFragment.CartFragment;
import com.example.foodiee.BottomNavFragment.SearchFragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListner);

        getSupportFragmentManager().beginTransaction().replace(R.id.framLayout, new MealFragment()).commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;

            switch (menuItem.getItemId()) {

                case R.id.meal:
                    fragment = new MealFragment();
                    setTitle("Meal");
                    break;
                case R.id.search:
                    fragment = new SearchFragment();
                    setTitle("Search");
                    break;
                case R.id.fav:
                    fragment = new FavFragment();
                    setTitle("Favourite");
                    break;
                case R.id.cart:
                    fragment = new CartFragment();
                    setTitle("Notification");
                    break;
                case R.id.account:
                    fragment = new AccountFragment();
                    setTitle("Account");
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.framLayout, fragment).commit();
            return true;
        }
    };
}
