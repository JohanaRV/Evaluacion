package com.example.evaluacion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static com.example.evaluacion.MainActivity.TAG_MENSAJE;
import static com.example.evaluacion.MainActivity.lstEstudiante;
import Entidades.Estudiante;


public class AddEstudiante extends AppCompatActivity {
    EditText edtNombre, edtCodigo, edtMateria, edtParcial1, edtParcial2,edtParcial3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_estudiante);

        edtNombre = findViewById(R.id.edtNombre);
        edtCodigo = findViewById(R.id.edtCodigo);
        edtMateria = findViewById(R.id.edtMateria);
        edtParcial1 = findViewById(R.id.edtParcial1);
        edtParcial2 = findViewById(R.id.edtParcial2);
        edtParcial3 = findViewById(R.id.edtParcial3);
    }

    public void onClickGuardar(View v){
        //Todos los campos vacios
        if(edtNombre.getText().toString().isEmpty() && edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial1.getText().toString().isEmpty() && edtParcial2.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese los campos").show();
            //Solo el nombre esta lleno
        }else if(edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty() && edtParcial1.getText().toString().isEmpty()
                && edtParcial2.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el codigo, materia, parcial 1, parcial 2, parcial 3").show();
            //Solo el codigo esta lleno
        }else if (edtNombre.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial1.getText().toString().isEmpty() && edtParcial2.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre, materia, parcial 1, parcial 2, parcial 3").show();
            //Solo el materia esta lleno
        }else  if (edtNombre.getText().toString().isEmpty() && edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial1.getText().toString().isEmpty() && edtParcial2.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre, codigo, parcial 1, parcial 2, parcial 3").show();
            //Solo el parcial1 esta lleno
        }else  if (edtNombre.getText().toString().isEmpty() && edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial2.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre, codigo, materia, parcial 2, parcial 3").show();
            //Solo el parcial2 esta lleno
        }else  if (edtNombre.getText().toString().isEmpty() && edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial1.getText().toString().isEmpty() && edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre, codigo, materia, parcial 1, parcial 3").show();
            //Solo el parcial3 esta llenoial
        }else  if (edtNombre.getText().toString().isEmpty() && edtCodigo.getText().toString().isEmpty() && edtMateria.getText().toString().isEmpty()
                && edtParcial1.getText().toString().isEmpty() && edtParcial2.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre, codigo, materia, parcial 1, parcial 2").show();
        }else if(edtNombre.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el nombre").show();
        }
        else if(edtCodigo.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el codigo").show();
        }
        else if(edtMateria.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese la materia").show();
        }
        else if(edtParcial1.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el parcial 1").show();
        }
        else if(edtParcial2.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el parcial 2").show();
        }
        else if(edtParcial3.getText().toString().isEmpty()){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("Ingrese el parcial 3").show();
        }else{
            Estudiante e = new Estudiante();
            double pro = (Double.parseDouble(edtParcial1.getText().toString()) * 0.3) +
                    (Double.parseDouble(edtParcial2.getText().toString()) * 0.3) +
                    (Double.parseDouble(edtParcial3.getText().toString()) * 0.4);

            e.setId(lstEstudiante.size() + 1);
            e.setNombre(edtNombre.getText().toString());
            e.setCodigo(edtCodigo.getText().toString());
            e.setMateria(edtMateria.getText().toString());
            e.setParcial1(Double.parseDouble(edtParcial1.getText().toString()));
            e.setParcial2(Double.parseDouble(edtParcial2.getText().toString()));
            e.setParcial3(Double.parseDouble(edtParcial3.getText().toString()));


            DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
            separadoresPersonalizados.setDecimalSeparator('.');
            DecimalFormat f1 = new DecimalFormat("#.##", separadoresPersonalizados);

            e.setPromedio(Double.parseDouble(f1.format(pro)));
            lstEstudiante.add(e);

            Intent msj = new Intent();
            msj.putExtra(TAG_MENSAJE, "Estudiante ingresado con éxito");
            setResult(RESULT_OK, msj);
            this.finish();

        }

    }
}
