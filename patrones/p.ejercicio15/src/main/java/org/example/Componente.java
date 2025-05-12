package org.example;

public class Componente implements PcComponent{
    private String nombre;
    private String descripcion;
    private double precio;
    private double consumo;

    public Componente(double consumo, String descripcion, String nombre, double precio) {
        this.consumo = consumo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double calcularConsumo() {
        return consumo;
    }

    @Override
    public void agregarComponente(Componente componente) {

    }
}
