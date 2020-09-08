package com.example.nac01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class blocoNotas extends AppCompatActivity {

    private String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloco_notas);
        this.path = getApplicationContext().getFilesDir().getPath().toString();
    }

    public void Salvar(View v) {
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtNota = findViewById(R.id.txtNota);

        String nome = txtNome.getText().toString();
        String nota = txtNota.getText().toString();
        String nomeNota = this.path + "/" + nome + ".txt";

        if (nome.length() == 0) {
            Toast.makeText(this, "A nota precisa de um nome ...", Toast.LENGTH_SHORT).show();
        } else {
            try {
//                BufferedWriter sd = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeNota), "UTF-8"));
                OutputStreamWriter saida = new OutputStreamWriter(new FileOutputStream(nomeNota), "UTF-8");
                saida.write(nota);
                saida.close();

//                FileOutputStream fs = openFileOutput(nome, Context.MODE_PRIVATE);

//                fs.write(nota.getBytes());
//                fs.close();
            } catch (FileNotFoundException e) {
                Toast.makeText(this, "Arquivo não encontrado ...", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void Abrir(View v) {
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtNota = findViewById(R.id.txtNota);
        String nome = txtNome.getText().toString();
        String nomeNota = this.path + "/" + nome + ".txt";

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(nomeNota), "UTF-8"));
            StringBuilder output = new StringBuilder();

            String linha = bf.readLine();

            while(linha != null) {
                output.append(linha);
                output.append("\n");
                linha = bf.readLine();
            }

            txtNota.setText(output.toString());
//            FileInputStream fi = openFileInput(nome);
//
//            int data = fi.read();
//            while(data != -1) {
//                output.append((char) data);
//                data = fi.read();
//            }
//
//            txtNota.setText(output.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Limpar(View view) {
        EditText nota = findViewById(R.id.txtNota);
        nota.setText("");
    }
}