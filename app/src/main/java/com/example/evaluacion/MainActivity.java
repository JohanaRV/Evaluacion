package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Entidades.Estudiante;

public class MainActivity extends AppCompatActivity {
    public static String TAG_MENSAJE = "Se realizó con exito";

    public static List<Estudiante> lstEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstEstudiante = new ArrayList<>();
    }

    public void onClickNuevoEstudiante(View v){
        Intent i = new Intent(this, AddEstudiante.class);
        startActivity(i);
    }
    public void onClickListaEstudiantes(View v){
        if (lstEstudiante.isEmpty()){
            Toast.makeText(this, "La lista esta vacia",Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, ListaEstudiante.class);
            startActivity(i);
        }

    }

    public  void onClickDatos(View v){
        Intent i = new Intent(this, Datos.class);
        startActivity(i);
    }
}
