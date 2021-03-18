package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NiveauxActivity extends AppCompatActivity {
    private Button buttonFacile;
    private Button buttonDifficile;
    private Button buttonExpert;
    private Button buttonChrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveaux);

        buttonFacile = (Button) findViewById(R.id.button_facile);
        buttonFacile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeuFacile();
            }
        });
        buttonDifficile = (Button) findViewById(R.id.button_difficile);
        buttonDifficile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeuDifficile();
            }
        });
        buttonExpert = (Button) findViewById(R.id.button_expert);
        buttonExpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeuExpert();
            }
        });
        buttonChrono = (Button) findViewById(R.id.button_chrono);
        buttonChrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeuChrono();
            }
        });
    }
    public void openJeuFacile() {
        Intent intent = new Intent(this, JeuActivity.class);
        intent.putExtra("Difficulte", 1);
        startActivity(intent);
    }
    public void openJeuDifficile() {
        Intent intent = new Intent(this, JeuActivity.class);
        intent.putExtra("Difficulte", 2);
        startActivity(intent);
    }
    public void openJeuExpert() {
        Intent intent = new Intent(this, JeuActivity.class);
        intent.putExtra("Difficulte", 3);
        startActivity(intent);
    }
    public void openJeuChrono() {
        Intent intent = new Intent(this, JeuActivity.class);
        intent.putExtra("Difficulte", 4);
        startActivity(intent);
    }

}