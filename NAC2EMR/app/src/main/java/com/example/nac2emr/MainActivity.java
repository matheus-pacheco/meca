package com.example.nac2emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startmercadoActivity (View view){
        Intent mercadoActivity = new Intent (this,mercadoActivity.class);
        startActivity(mercadoActivity);
    }
    public void startmagazineActivity (View view){
        Intent magazineActivity = new Intent (this,magazineActivity.class);
        startActivity(magazineActivity);
    }
    public void startamActivity (View view){
        Intent amActivity = new Intent (this,amActivity.class);
        startActivity(amActivity);
    }
    public void startsobreActivity (View view){
        Intent sobreActivity = new Intent (this,sobreActivity.class);
        startActivity(sobreActivity);
    }
}
