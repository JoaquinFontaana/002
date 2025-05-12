package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;

public class Automovil extends Prenda{
    private Year modelo;
    private int kilometraje;
    private double costo0KM;

    public Automovil( double costo0KM, int kilometraje, Year modelo) {
        super(0.7);
        this.costo0KM = costo0KM;
        this.kilometraje = kilometraje;
        this.modelo = modelo;
    }

    @Override
    public double calcularValor() {
        return this.costo0KM * this.calcularReduccion();
    }
    private double calcularReduccion(){
        return (LocalDate.now().getYear() - this.modelo.getValue()) * 0.1;
    }

    @Override
    public void agregarPrenda(Prenda prenda) {

    }
}
