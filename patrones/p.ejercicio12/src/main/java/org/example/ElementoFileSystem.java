package org.example;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoFileSystem {
    private String nombre;
    private LocalDate fechaCreacion;
    private int tamaño;

    public ElementoFileSystem(int tamaño,String nombre){
        this.fechaCreacion = LocalDate.now();
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void buscarPorNombre(String nombre, List<ElementoFileSystem> coincidencias){
        if(this.nombre.equals(nombre)){
            coincidencias.add(this);
        }
        this.buscarCoincidenciasElementos(nombre,coincidencias);
    }

    public abstract Archivo archivoMasNuevo();

    public void listadoContenido(List<String> contenido,String rutaPadre){
        String rutaActual = rutaPadre + "/" + this.getNombre();
        contenido.add(rutaActual);
        this.listarElementos(contenido,rutaActual);
    }

    public abstract int calcularTamaño();

    public abstract void listarElementos(List<String> contenido,String rutaActual);

    public abstract void buscarCoincidenciasElementos(String nombre, List<ElementoFileSystem> coincidencias);

    public abstract void eliminarElemento(ElementoFileSystem elemento);

    public abstract void agregarElemento(ElementoFileSystem elemento);

    public abstract Archivo archivoMasGrande();

    public int getTamaño() {
        return tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
