package com.hist0r.journey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JourneyFootball extends AppCompatActivity {

    ImageButton BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey_football);
        BackBtn = findViewById(R.id.backbtn1);

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JourneyFootball.this,MainActivity.class));
                finish();
            }
        });
    }
}