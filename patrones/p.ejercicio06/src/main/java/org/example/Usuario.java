package org.example;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    public Usuario(String nombre,String apellido,String email){
        this.apellido = apellido;
        this.email = email;
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
}
