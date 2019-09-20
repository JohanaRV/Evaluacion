package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.evaluacion.MainActivity.lstEstudiante;

import Adaptadores.Adaptador;
import Entidades.Estudiante;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEstudiante extends AppCompatActivity {
    ListView lstVestudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiante);
        lstVestudiante = findViewById(R.id.lstVestudiante);
        lstVestudiante.setAdapter(new Adaptador(this, R.layout.plantilla_lista, lstEstudiante));
    }
}
