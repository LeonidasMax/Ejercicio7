package pkgAlumnos;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class CursosAsignados extends ArrayList<Curso> {

    private List<Curso> Cursos;


    public CursosAsignados() {
        super();
        this.Cursos = new ArrayList<>();
    }

    @Override
    public boolean add(Curso Curso) {
        if (!this.Cursos.contains(Curso)) {
            this.Cursos.add(Curso);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return this.Cursos.stream().anyMatch((Curso) -> (Curso == null ? o == null : Curso.equals(o)));
    }
    @Override
        public Iterator<Curso> iterator(){
        return this.Cursos.iterator();
        }
        @Override
        public  int size() {
            return this.Cursos.size();
        }


}