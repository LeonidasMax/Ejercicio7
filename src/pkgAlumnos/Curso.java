package pkgAlumnos;

public class Curso {
    private String Codigo;
    private String Nombre;
    private Double Costo;

    public Curso(String Codigo, String Nombre, Double Costo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Costo = Costo;

    }
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double costo) {
        Costo = costo;
    }
}
