package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public String Carnet;
    public String Nombre;
    public String Telefono;
    public String Direccion;
    private List<Curso> Cursos;

    public Alumno(String Carnet, String Nombre, String Telefono, String Direccion){
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Cursos = new ArrayList<>();
    }
    public void AgregarCurso (Curso Curso){
        this.Cursos.add(Curso);
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String carnet) {
        Carnet = carnet;
    }
    public String getNombre(){
        return Nombre;
            }
    public void setNombre(String Nombre){
        Nombre = Nombre;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDirección(String dirección) {
        Direccion = Direccion;
    }

    public List<Curso> getCursos() {
        return Cursos;
    }

    public void setCursos(List<Curso> cursos) {
        Cursos = cursos;
    }
}
public double getTotal(){
    double t = 0;
    for (Curso c: Cursos){
        t=t+c.getCosto();
    }
}