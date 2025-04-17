package org.example;

import java.util.List;
import java.util.stream.Collectors;

public interface SugerenciaStrategy {
    public List<Pelicula> sugerencia(Decodificador decodificador);
}
