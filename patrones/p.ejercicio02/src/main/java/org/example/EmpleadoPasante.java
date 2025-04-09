package org.example;

public class EmpleadoPasante extends Empleado{
    private int examenesRendidos;
    @Override
    public double calcularAdicionales() {
        return this.examenesRendidos * 2000;
    }
}
