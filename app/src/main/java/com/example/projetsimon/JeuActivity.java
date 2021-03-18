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




}