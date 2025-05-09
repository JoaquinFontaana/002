package org.example;

public class Mensajero {
    private Cifrado cifrador;

    public Mensajero(Cifrado cifrador){
        this.cifrador = cifrador;
    }

    public String enviar(String mensaje){
        return this.cifrador.cifrar(mensaje);

    }
    public String recibir(String mensaje){
        return this.cifrador.descifrar(mensaje);
    }
    public void setCifrador(Cifrado cifrador){
        this.cifrador = cifrador;
    }
}
