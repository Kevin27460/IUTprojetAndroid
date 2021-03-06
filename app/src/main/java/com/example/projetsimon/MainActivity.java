package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private Button buttonPlay;
    private Button buttonRegle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = (Button) findViewById(R.id.button_jouer);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNiveaux();
            }
        });
        buttonRegle = (Button) findViewById(R.id.button_regle);
        buttonRegle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegle();
            }
        });
    }


    public void openNiveaux() {
        Intent intent = new Intent(this, NiveauxActivity.class);
        startActivity(intent);
    }
    public void openRegle() {
        Intent intent = new Intent(this, regle.class);
        startActivity(intent);
    }
}
