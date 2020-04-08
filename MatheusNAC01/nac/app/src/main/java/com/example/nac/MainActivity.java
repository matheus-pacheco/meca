package com.example.nac;

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

    public void startmain2Activity (View view){
        Intent Main2Activity = new Intent(this, Main2Activity.class);
        startActivity(Main2Activity);
    }
    public void startmain3Activity (View view){
        Intent Main3Activity = new Intent(this, MainActivity.class);
        startActivity(Main3Activity);
    }
    public void startmain4Activity (View view){
        Intent Main4Activity = new Intent(this, Main4Activity.class);
        startActivity(Main4Activity);
    }
    public void startmain5Activity (View view){
        Intent Main5Activity = new Intent(this, Main5Activity.class);
        startActivity(Main5Activity);
    }
}