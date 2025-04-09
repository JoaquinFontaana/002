package org.example;

public class EmpleadoPasante extends Empleado{
    private int examenesRendidos;

    public EmpleadoPasante(double sueldoBasico, int examenesRendidos) {
        super(sueldoBasico);
        this.examenesRendidos = examenesRendidos;
    }

    @Override
    public double calcularAdicionales() {
        return this.examenesRendidos * 2000;
    }
}
