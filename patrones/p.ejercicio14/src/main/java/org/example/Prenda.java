package org.example;

public abstract class Prenda {
    private double liquidez;

    public abstract double calcularValor();
    public abstract void agregarPrenda(Prenda prenda);

    public Prenda(double liquidez) {
        this.liquidez = liquidez;
    }

    public double calcularValorPrendario() {
        return this.calcularValor() * this.liquidez;
    }
}
