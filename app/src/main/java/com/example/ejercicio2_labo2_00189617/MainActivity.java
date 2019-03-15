package com.example.ejercicio2_labo2_00189617;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int  cont1=0, cont2 =1, cont3=2, cont4=3, cont5=4, cont6=5, cont7=6, cont8=7, cont9=8;

    ImageView opcion1, opcion2, opcion3, opcion4, opcion5, opcion6,opcion7,opcion8,opcion9;


    int[] galeria = { R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4, R.drawable.icon5, R.drawable.icon6, R.drawable.icon7, R.drawable.icon8, R.drawable.icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcion1 = (ImageView) findViewById(R.id.imagen1);
        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion1.setImageResource(galeria[cont1]);
                cont1++;
                if(cont1==9){
                    cont1=0;
                }

            }
        });

        opcion2 = (ImageView) findViewById(R.id.imagen2);
        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion2.setImageResource(galeria[cont2]);
                cont2++;
                if(cont2==9){
                    cont2=0;
                }

            }
        });

        opcion3 = (ImageView) findViewById(R.id.imagen3);
        opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion3.setImageResource(galeria[cont3]);
                cont3++;
                if(cont3==9){
                    cont3=0;
                }

            }
        });

        opcion4 = (ImageView) findViewById(R.id.imagen4);
        opcion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion4.setImageResource(galeria[cont4]);
                cont4++;
                if(cont4==9){
                    cont4=0;
                }

            }
        });

        opcion5 = (ImageView) findViewById(R.id.imagen5);
        opcion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion5.setImageResource(galeria[cont5]);
                cont5++;
                if(cont5==9){
                    cont5=0;
                }

            }
        });

        opcion6 = (ImageView) findViewById(R.id.imagen6);
        opcion6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion6.setImageResource(galeria[cont6]);
                cont6++;
                if(cont6==9){
                    cont6=0;
                }

            }
        });

        opcion7 = (ImageView) findViewById(R.id.imagen7);
        opcion7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion7.setImageResource(galeria[cont7]);
                cont7++;
                if(cont7==9){
                    cont7=0;
                }

            }
        });

        opcion8 = (ImageView) findViewById(R.id.imagen8);
        opcion8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion8.setImageResource(galeria[cont8]);
                cont8++;
                if(cont8==9){
                    cont8=0;
                }

            }
        });

        opcion9 = (ImageView) findViewById(R.id.imagen9);
        opcion9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion9.setImageResource(galeria[cont9]);
                cont9++;
                if(cont9==9){
                    cont9=0;
                }

            }
        });
    }
}
