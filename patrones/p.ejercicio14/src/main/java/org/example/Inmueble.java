package org.example;

public class Inmueble extends Prenda{
    private String direccion;
    private int superficie;
    private float costoMetro;

    public Inmueble( float costoMetro, String direccion, int superficie) {
        super(0.2);
        this.costoMetro = costoMetro;
        this.direccion = direccion;
        this.superficie = superficie;
    }

    @Override
    public double calcularValor() {
        return this.costoMetro * this.superficie;
    }

    @Override
    public void agregarPrenda(Prenda prenda) {

    }
}
