package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
    private List<Pelicula> catalogo;
    private List<Pelicula> peliculasReproducidas;
    private SugerenciaStrategy sugerenciaStrategy;

    public Decodificador (List<Pelicula> catalogo, SugerenciaStrategy sugerenciaStrategy){
        this.catalogo = catalogo;
        this.peliculasReproducidas = new ArrayList<>();
        this.sugerenciaStrategy = sugerenciaStrategy;
    }

    public List<Pelicula> sugerirPeliculas(){
        return this.sugerenciaStrategy.sugerencia(this);
    }

    public List<Pelicula> getPeliculasNoReproducidas() {
        return catalogo.stream()
                .filter(pelicula -> !peliculasReproducidas.contains(pelicula)).collect(Collectors.toList());
    }

    public List<Pelicula> getPeliculasReproducidas() {
        return peliculasReproducidas;
    }
}
