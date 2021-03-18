package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NiveauxActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveaux);


        button = (Button) findViewById(R.id.button_jouer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficulte();
            }
        });
    }
    public void openDifficulte() {
        Intent intent = new Intent(this, JeuActivity.class);
        startActivity(intent);
    }

}