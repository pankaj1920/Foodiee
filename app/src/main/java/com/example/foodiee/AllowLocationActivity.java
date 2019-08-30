package com.example.foodiee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllowLocationActivity extends AppCompatActivity {

    ConstraintLayout allowLocationLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allow_location);

        allowLocationLayout = (ConstraintLayout)findViewById(R.id.allowLocationLayout);

        allowLocationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllowLocationActivity.this, DeliveryLocationMapActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
