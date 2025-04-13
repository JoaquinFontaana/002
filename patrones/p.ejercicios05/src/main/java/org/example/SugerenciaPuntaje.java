package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje implements SugerenciaStrategy{
    @Override
    public List<Pelicula> sugerencia(Decodificador decodificador) {
        return decodificador
                .getPeliculasNoReproducidas()
                .stream()
                .sorted(Pelicula.porPuntajeDescendenteYAñoEstreno)
                .collect(Collectors.toList());
    }
}
