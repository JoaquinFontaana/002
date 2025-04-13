package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SugerenciaSimilitud implements SugerenciaStrategy{

    @Override
    public List<Pelicula> sugerencia(Decodificador decodificador) {
        List<Pelicula> peliculasReproducidas = decodificador.getPeliculasReproducidas();
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(peliculasReproducidas.size());
        return peliculasReproducidas
                .get(indiceAleatorio)
                .getPeliculasSimilares()
                .stream()
                .filter(pelicula -> !peliculasReproducidas.contains(pelicula))
                .sorted(Pelicula.porAñoEstrenoDescendente)
                .limit(3)
                .collect(Collectors.toList());
    }
}
