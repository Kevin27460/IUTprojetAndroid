package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_jouer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficulte();
            }
        });
    }
    public void openDifficulte() {
        Intent intent = new Intent(this, NiveauxActivity.class);
        startActivity(intent);
    }
}
