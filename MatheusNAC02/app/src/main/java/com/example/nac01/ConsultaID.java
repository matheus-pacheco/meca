package com.example.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConsultaID extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_i_d);
    }

    public void  pesquisar(View v) {
//        Toast.makeText(this, "Pesquisando ...", Toast.LENGTH_SHORT).show();
        
        EditText txtId = findViewById(R.id.txtId);
        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtCompleted = findViewById(R.id.txtCompleted);

        txtTitle.setText("");
        txtCompleted.setText("");

        String url = "https://jsonplaceholder.typicode.com/todos/" + txtId.getText().toString();

        new DataGetter(txtTitle, txtCompleted).execute(url);
    }
}