package com.example.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btConsulta = findViewById(R.id.btConsulta);
        Button btBloco = findViewById(R.id.btBloco);
    }

    public void goToConsulta(View v) {
        Intent intent = new Intent(this, ConsultaID.class);
        startActivity(intent);
    }

    public void goToBloco(View v) {
        Intent intent = new Intent(this, blocoNotas.class);
        startActivity(intent);
    }
}