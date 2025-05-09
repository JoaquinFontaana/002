package org.example;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private Directorio directorioRaiz;

    public FileSystem(Directorio directorioRaiz) {
        this.directorioRaiz = directorioRaiz;
    }



    /**
     * Retorna el espacio total ocupado, incluyendo todo su contenido.
     */
    public int tamanoTotalOcupado(){
        return this.directorioRaiz.calcularTamaño();
    }

    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
     * filesystem
     */
    public Archivo archivoMasGrande(){
        return this.directorioRaiz.archivoMasGrande();
    }

    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel
     * del filesystem
     */
    public Archivo archivoMasNuevo(){
        return this.directorioRaiz.archivoMasNuevo();
    }

    /**
     * Retorna el primer elemento con el nombre solicitado contenido en cualquier
     * nivel del filesystem
     */
    public ElementoFileSystem buscar(String nombre){
        ArrayList<ElementoFileSystem> coincidencias = new ArrayList<>();
        this.directorioRaiz.buscarCoincidenciasElementos(nombre,coincidencias);
        return coincidencias.get(0);
    }
    /**
     * Retorna la lista con los elementos que coinciden con el nombre solicitado
     * contenido en cualquier nivel del filesystem
     */
    public List<ElementoFileSystem> buscarTodos(String nombre){
        ArrayList<ElementoFileSystem> coincidencias = new ArrayList<>();
        this.directorioRaiz.buscarCoincidenciasElementos(nombre,coincidencias);
        return coincidencias;
    }
    /**
     * Retorna un String con los nombres de los elementos contenidos en todos los
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación
     /Directorio A
     /Directorio A/Directorio A.1
     /Directorio A/Directorio A.1/Directorio A.1.1
     /Directorio A/Directorio A.1/Directorio A.1.2
     /Directorio A/Directorio A.2
     /Directorio B
     */
    public List<String> listadoDeContenido(){
        ArrayList<String> listadoContenido = new ArrayList<>();
        this.directorioRaiz.listadoContenido(listadoContenido,"");
        return listadoContenido;
    }

}
