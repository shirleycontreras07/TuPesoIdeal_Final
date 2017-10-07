package com.example.shirley.tupesoideal_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Button_SistemaAnglosajon).setOnClickListener(this);
        findViewById(R.id.Button_SistemaInternacional).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()){
            case R.id.Button_SistemaAnglosajon:
                intent = new Intent(this,SistemaAnglosajonActivity.class);
                break;

            case  R.id.Button_SistemaInternacional:
                intent = new Intent(this, SistemaInternacionalActivity.class);
                break;
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
