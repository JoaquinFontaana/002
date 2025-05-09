package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends ElementoFileSystem{
    private List<ElementoFileSystem> elementos;

    public Directorio(String nombre) {
        super(32,nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public void buscarCoincidenciasElementos(String nombre, List<ElementoFileSystem> coincidencias) {
        this.elementos.stream()
                .forEach(elemento -> elemento.buscarPorNombre(nombre,coincidencias));
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.elementos.stream()
                .map(elemento -> elemento.archivoMasGrande())
                .max((a1,a2) -> Integer.compare(a1.getTamaño(),a2.getTamaño()))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return elementos.stream()
                .map(ElementoFileSystem::archivoMasNuevo)
                .max((a1, a2) ->
                        a1.getFechaCreacion().compareTo(a2.getFechaCreacion())
                )
                .orElse(null);
    }

    @Override
    public void listarElementos(List<String> contenido,String rutaActual) {
        this.elementos.stream().forEach(elemento -> elemento.listadoContenido(contenido,rutaActual));
    }

    @Override
    public void agregarElemento(ElementoFileSystem elemento){
        this.elementos.add(elemento);
    }

    @Override
    public void eliminarElemento(ElementoFileSystem elemento) {
        this.elementos.remove(elemento);
    }

    @Override
    public int calcularTamaño() {
        return this.getTamaño() +
                this.elementos.stream().mapToInt(elemento -> elemento.calcularTamaño()).sum();
    }

}
