package org.example;

import org.junit.jupiter.api.BeforeEach;

public class FileSystemTest {
    private FileSystem fileSystem;

    @BeforeEach
    public void setUp(){
        Directorio directorioRaiz = new Directorio("");
        directorioRaiz.agregarElemento(new Archivo("chau",10000));
        directorioRaiz.agregarElemento(new Archivo("gta10",10));
        Directorio directorio1 = new Directorio("hola");
        directorioRaiz.agregarElemento(directorio1);
        new FileSystem(directorioRaiz);
    }
}
