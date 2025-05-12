package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Prenda{
    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;

    public Alquiler( LocalDate comienzoContrato, double costoMensual, LocalDate finContrato) {
        super(0.9);
        this.comienzoContrato = comienzoContrato;
        this.costoMensual = costoMensual;
        this.finContrato = finContrato;
    }

    @Override
    public double calcularValor() {
        return this.costoMensual * this.mesesRestantes();
    }

    private int mesesRestantes(){
        return Period.between(this.comienzoContrato,this.finContrato).getMonths();
    }

    @Override
    public void agregarPrenda(Prenda prenda) {

    }
}
