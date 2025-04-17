package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaMasRecientes implements SugerenciaStrategy{
    @Override
    public List<Pelicula> sugerencia(Decodificador decodificador) {

        return decodificador
                .getPeliculasNoReproducidas()
                .stream()
                .sorted(Pelicula.porAñoEstrenoDescendente)
                .limit(3)
                .collect(Collectors.toList());
    }
}
