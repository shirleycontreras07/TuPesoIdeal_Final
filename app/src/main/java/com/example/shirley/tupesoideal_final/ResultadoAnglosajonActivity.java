package com.example.shirley.tupesoideal_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ResultadoAnglosajonActivity extends AppCompatActivity {
    TextView tvResultadoAnglosajon,tvResultadoCategoriaAnglosajon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_anglosajon);
        tvResultadoAnglosajon = (TextView) findViewById(R.id.TextViewResultadoAnglosajon);
        tvResultadoCategoriaAnglosajon = (TextView) findViewById(R.id.TextViewResultadoCategoriaAnglosajon);
        Intent intent = getIntent();
        double altura = intent.getDoubleExtra("estatura",0);
        double peso = intent.getDoubleExtra("peso",0);
         int edad = intent.getIntExtra("edad",0);
        double IMCAnglosajon = new BigDecimal(703*( peso /((altura*12) * (altura*12)))).setScale(2, RoundingMode.HALF_UP).doubleValue();
            tvResultadoAnglosajon.setText(String.valueOf(IMCAnglosajon));

            if (IMCAnglosajon < 16) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en un estado de delgadez severa");
            } else if (IMCAnglosajon == 16 && IMCAnglosajon < 17) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en un estado de delgadez moderada");
            } else if (IMCAnglosajon >= 17 && IMCAnglosajon < 18.5) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en un estado de delgadez leve");
            } else if (IMCAnglosajon >= 18.5 && IMCAnglosajon < 25) {
                tvResultadoCategoriaAnglosajon.setText("Su peso actual está dentro de lo normal");
            } else if (IMCAnglosajon >= 25 && IMCAnglosajon < 30) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en un estado de sobrepeso");
            } else if (IMCAnglosajon >= 30 && IMCAnglosajon < 35) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en la primera fase de obesidad");
            } else if (IMCAnglosajon >= 35 && IMCAnglosajon < 40) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en la segunda fase de obesidad");
            } else if (IMCAnglosajon > 40) {
                tvResultadoCategoriaAnglosajon.setText("Usted se encuentra en la tercera fase de obesidad");
            }






    }


}
