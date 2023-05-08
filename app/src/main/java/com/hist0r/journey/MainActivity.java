package com.hist0r.journey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {
    Button JourneyfootballBtn, SecretBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JourneyfootballBtn = findViewById(R.id.legendbtn);
        SecretBtn = findViewById(R.id.miraclebtn);

        JourneyfootballBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,JourneyFootball.class));
                Animatoo.INSTANCE.animateInAndOut(MainActivity.this);
                finish();
            }
        });

        SecretBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FootballSecret.class));
                Animatoo.INSTANCE.animateCard(MainActivity.this);
                finish();
            }
        });
    }
}