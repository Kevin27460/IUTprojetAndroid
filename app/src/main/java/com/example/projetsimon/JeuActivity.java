package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JeuActivity extends AppCompatActivity {
    private Button buttonQuitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);


        buttonQuitter = (Button) findViewById(R.id.button_quitter);
        buttonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNiveaux();
            }
        });
    }

    public void openNiveaux() {
        Intent intent = new Intent(this, NiveauxActivity.class);
        startActivity(intent);
    }

}