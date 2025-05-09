package org.example;

import java.util.List;

public class Archivo extends ElementoFileSystem{

    public Archivo(String nombre,int tamaño){
        super(tamaño,nombre);
    }

    @Override
    public int calcularTamaño() {
        return this.getTamaño();
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public void buscarCoincidenciasElementos(String nombre, List<ElementoFileSystem> coincidencias) {

    }

    @Override
    public void listarElementos(List<String> contenido,String rutaActual) {

    }

    @Override
    public void eliminarElemento(ElementoFileSystem elemento) {

    }

    @Override
    public void agregarElemento(ElementoFileSystem elemento) {

    }

}
