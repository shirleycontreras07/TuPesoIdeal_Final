package com.example.shirley.tupesoideal_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SistemaAnglosajonActivity extends AppCompatActivity  {

    EditText peso, estatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_anglosajon);
        estatura = (EditText) findViewById(R.id.EditText_EstaturaAnglosajon);
        peso = (EditText) findViewById(R.id.EditText_MasaAnglosajon);


    }

    public void CalcularonClick(View v) {
        try {

            Intent intent = new Intent(this, ResultadoAnglosajonActivity.class);
            double height = Double.valueOf(estatura.getText().toString());
            double mass = Double.valueOf(peso.getText().toString());
            intent.putExtra("peso", mass);
            intent.putExtra("estatura", height);

            startActivity(intent);

               } catch (Exception e){
            Toast.makeText(this,"Ingreso de datos incorrecto",Toast.LENGTH_SHORT).show();

        }
    }
}
