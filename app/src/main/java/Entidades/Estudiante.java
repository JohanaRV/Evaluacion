package Entidades;

public class Estudiante {
    private int id;
    private String nombre;
    private String codigo;
    private String materia;
    private double parcial1;
    private double parcial2;
    private double parcial3;
    private double promedio;

    public Estudiante(){

    }

    public Estudiante(int i, String n, String c, String m, double p){
        this.id = i;
        this.nombre = n;
        this.codigo = c;
        this.materia = m;
        this.promedio = p;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public double getParcial3() {
        return parcial3;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }


}
