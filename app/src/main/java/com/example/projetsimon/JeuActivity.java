package com.example.projetsimon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class JeuActivity extends AppCompatActivity {
    private Button buttonQuitter;
    private Button Button01;
    private Button Button02;
    private Button Button03;
    private Button Button04;
    private Button Button05;
    private Button Button06;
    private Button Button07;
    private Button Button08;
    private Button Button09;
    private Button Button10;
    int [] sequenceTab = new int[19];
    int maxSeq = 0;
    int startSeq = 0;
    int nbrBloc = 0;
    int vie = 0;
    double multiplicateurScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);
        Button01= (Button) findViewById(R.id.button01);
        Button02= (Button) findViewById(R.id.button02);
        Button03= (Button) findViewById(R.id.button03);
        Button04= (Button) findViewById(R.id.button04);
        Button05= (Button) findViewById(R.id.button05);
        Button06= (Button) findViewById(R.id.button06);
        Button07= (Button) findViewById(R.id.button07);
        Button08= (Button) findViewById(R.id.button08);
        Button09= (Button) findViewById(R.id.button09);
        Button10= (Button) findViewById(R.id.button10);

        buttonQuitter = (Button) findViewById(R.id.button_quitter);
        buttonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNiveaux();
            }
        });


        Intent intent = getIntent();
        int niveaux = 0;
        if (intent != null) {
            if (intent.hasExtra("Difficulte")) {
                niveaux = intent.getIntExtra("Difficulte", 0);
            }
        }

        Jeu(niveaux);

    }

    public void openNiveaux() {
        Intent intent = new Intent(this, NiveauxActivity.class);
        startActivity(intent);
    }

    public void Jeu(int niveaux) {

        Button01.getBackground().setAlpha(0);
        Button02.getBackground().setAlpha(0);
        Button03.getBackground().setAlpha(0);
        Button04.getBackground().setAlpha(0);
        Button05.getBackground().setAlpha(0);
        Button06.getBackground().setAlpha(0);
        Button07.getBackground().setAlpha(0);
        Button08.getBackground().setAlpha(0);
        Button09.getBackground().setAlpha(0);
        Button10.getBackground().setAlpha(0);

        switch(niveaux) {
            case 1:
                //Facile
                Button02.getBackground().setAlpha(32);
                Button04.getBackground().setAlpha(32);
                Button08.getBackground().setAlpha(32);
                Button10.getBackground().setAlpha(32);

                startSeq = 1;
                vie  = 2;
                multiplicateurScore = 1;
                break;
            case 2:
                //Difficile
                startSeq = 3;
                vie  = 2;
                multiplicateurScore = 1.5;
                break;
            case 3:
                //Expert
                startSeq = 5;
                vie  = 3;
                multiplicateurScore = 3;
                break;
            case 4:
                //Chrono
                startSeq = 1;
                vie  = 3;
                multiplicateurScore = 2;
                break;
        }
        initTab();
    }

    private void initTab(){
        for(int i =0; i < startSeq; i++)
            sequenceTab[i] = new Random().nextInt(nbrBloc);
            maxSeq=startSeq;
    }

    private void affichage(){
        for(int i=0; i<maxSeq;i++)
        {
            switch(sequenceTab[i]) {
                case 0:
                    Button02.getBackground().setAlpha(32);
                    break;
                case 1:
                    Button04.getBackground().setAlpha(32);
                    break;
                case 2:
                    Button08.getBackground().setAlpha(32);
                    break;
                case 3:
                    Button10.getBackground().setAlpha(32);
                    break;
                case 4:
                    Button06.getBackground().setAlpha(32);
                    break;
                case 5:
                    Button01.getBackground().setAlpha(32);
                    break;
                case 6:
                    Button03.getBackground().setAlpha(32);
                    break;
                case 7:
                    Button09.getBackground().setAlpha(32);
                    break;
                case 8:
                    Button05.getBackground().setAlpha(32);
                    break;
                case 9:
                    Button07.getBackground().setAlpha(32);
                    break;
            }
        }
    }


    
}
      
    
    
    
    
    
    

   /* nbrBloc = 4;
    for(int i =0; i <= startSeq;i++)
     sequenceTab = new Random().nextInt(nbrBloc)
     maxSeq=startSeq;

        nouvCouleur new Random().nextInt(nbrBloc);
    sequenceTab [maxSeq] = nouvCouleur;
    maxSeq ++;

        for(int i=0; i<maxSeq;i++)
        {
         switch(sequenceTab[i]) {
                    case 0:
                         //allume le cube 1
                    break;
                    case 1:
                         //allume le cube 2
                    break;
                    case 2:
                         //allume le cube 3
                    break;
                    case 3:
                         //allume le cube 4
                    break;
                    case 4:
                         //allume le cube 5
                    break;
                    case 5:
                         //allume le cube 6
                    break;
                    case 6:
                        //allume le cube 7
                   break;
                   case 7:
                        //allume le cube 8
                  break;
                  case 8:
                       //allume le cube 9
                 break;
                 case 9:
                       //allume le cube 10
                 break;
                 }
            }
        myButton.getBackground().setAlpha(255);

            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifSeq(numero du bloc);
            }
                    });
                            }
            public void verifSeq(int bloc) {
                    if(sequenceTab[position]==bloc)
                    position++;
                    else
                    vie--;
                    position = 0;
                    }


                 */




