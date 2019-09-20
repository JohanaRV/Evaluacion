package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.example.evaluacion.R;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import Entidades.Estudiante;

import java.util.List;

public class Adaptador extends BaseAdapter {
    private List<Estudiante> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;




    public List<Estudiante> GetData(){
        return this.datasource;
    }

    //El constructor original sin img solo lleva public Adaptador(Context context, int IdPlantilla, List<InfoOrden> sources)
    public Adaptador(Context context, int IdPlantilla, List<Estudiante> sources){
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }

    @Override
    public int getCount() {
        //devolver el tamaño de la lista
        return this.datasource.size();
    }

    @Override
    public Object getItem(int position) {
        //devuelve el item en la posicion indicada
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //Validamos que no exista un formato
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);

            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView txtCorrelativo = convertView.findViewById(R.id.txtCorrelativo);
            TextView txtNombre = convertView.findViewById(R.id.txtNombre);
            TextView txtCodigo = convertView.findViewById(R.id.txtCodigo);
            TextView txtMateria = convertView.findViewById(R.id.txtMateria);
            TextView txtPromedio = convertView.findViewById(R.id.txtPromedio);


            //Obtenemos el dato a mostrar
            String id = Integer.toString(this.datasource.get(position).getId());
            txtCorrelativo.setText(id);
            txtNombre.setText(this.datasource.get(position).getNombre());
            txtCodigo.setText(this.datasource.get(position).getCodigo());
            txtMateria.setText(this.datasource.get(position).getMateria());
            String Prom = Double.toString(this.datasource.get(position).getPromedio());
            txtPromedio.setText(Prom);


        }
        return convertView;
    }
}

