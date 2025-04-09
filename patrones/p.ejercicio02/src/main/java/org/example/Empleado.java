package org.example;

public abstract class Empleado {
    private double sueldoBasico;
    private double descuentoSueldoBasico;
    private double descuentoSueldoAdicional;

    public Empleado (double sueldoBasico){
        this.sueldoBasico= sueldoBasico;
        this.descuentoSueldoBasico = 0.13;
        this.descuentoSueldoAdicional = 0.05;
    }

    public double sueldo(){
        return calcularDescuentoBasico(this.sueldoBasico) + this.calcularDescuentoAdicional(this.calcularAdicionales());
    }
    private double calcularDescuentoBasico (double sueldo){
        return sueldo - sueldo * this.descuentoSueldoBasico;
    }
    private double calcularDescuentoAdicional(double sueldo){
        return sueldo - sueldo * this.descuentoSueldoAdicional;
    }
    public abstract double calcularAdicionales();
}
