package com.example.shirley.tupesoideal_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ResultadoInternacionalActivity extends AppCompatActivity {
    TextView tvResultadoInternacional,tvResultadoCategoriaInternacional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_internacional);
        tvResultadoInternacional = (TextView) findViewById(R.id.TextViewResultadoInternacional);
        tvResultadoCategoriaInternacional = (TextView)findViewById(R.id.TextViewResultadoCategoriaInternacional);
        Intent intent = getIntent();
        double altura = intent.getDoubleExtra("estatura",0);
        double peso = intent.getDoubleExtra("peso",0);
        double IMCInternacional = new BigDecimal((peso/(altura * altura))).setScale(2, RoundingMode.HALF_UP).doubleValue() ;
        tvResultadoInternacional.setText(String.valueOf(IMCInternacional));

        if(IMCInternacional<16){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en un estado de delgadez severa");
        } else if (IMCInternacional==16 && IMCInternacional<17){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en un estado de delgadez moderada");
        } else if (IMCInternacional>=17 && IMCInternacional<18.5){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en un estado de delgadez leve");
        } else if(IMCInternacional>=18.5 && IMCInternacional<25){
            tvResultadoCategoriaInternacional.setText("Su peso actual está dentro de lo normal");
        } else if(IMCInternacional>=25 && IMCInternacional<30){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en un estado de sobrepeso");
        } else if(IMCInternacional>=30 && IMCInternacional<35){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en la primera fase de obesidad");
        } else if(IMCInternacional>=35 && IMCInternacional<40){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en la segunda fase de obesidad");
        } else if(IMCInternacional>40){
            tvResultadoCategoriaInternacional.setText("Usted se encuentra en la tercera fase de obesidad");
        }
    }
}
