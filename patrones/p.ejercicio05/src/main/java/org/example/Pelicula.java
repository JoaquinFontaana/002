package org.example;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class Pelicula{
    private String titulo;
    private Year añoEstreno;
    private HashSet<Pelicula> peliculasSimilares;
    private Double puntaje;

    public static Comparator<Pelicula> porAñoEstrenoDescendente = Comparator.comparing(Pelicula::getAñoEstreno).reversed();
    public static Comparator<Pelicula> porPuntajeDescendenteYAñoEstreno =
            Comparator.comparing(Pelicula::getPuntaje)
                    .reversed()
                    .thenComparing(Pelicula::getAñoEstreno).reversed();

    public Pelicula (Year añoEstreno, String titulo, double puntaje){
        this.añoEstreno = añoEstreno;
        this.puntaje = puntaje;
        this.titulo = titulo;
        this.peliculasSimilares = new HashSet<>();
    }

    public void agregarPeliculaSimilar(Pelicula pelicula){
        if(this.peliculasSimilares.add(pelicula)){
            pelicula.agregarPeliculaSimilar(this);
        };
    }

    public Year getAñoEstreno() {
        return añoEstreno;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public HashSet<Pelicula> getPeliculasSimilares() {
        return peliculasSimilares;
    }

    //Para que el hashSet no admita duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo) &&
                Objects.equals(añoEstreno, pelicula.añoEstreno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, añoEstreno);
    }
}
