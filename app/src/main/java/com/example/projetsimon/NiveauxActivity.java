package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NiveauxActivity extends AppCompatActivity {
    private Button buttonFacile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveaux);

        buttonFacile = (Button) findViewById(R.id.button_facile);
        buttonFacile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeu();
            }
        });
    }
    public void openJeu() {
        Intent intent = new Intent(this, JeuActivity.class);
        intent.putExtra("Difficulté", 1);
        startActivity(intent);
    }

}