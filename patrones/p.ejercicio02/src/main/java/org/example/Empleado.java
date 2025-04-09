package org.example;

public abstract class Empleado {
    private double sueldoBasico;
    private double descuentoSueldoBasico;
    private double descuentoSueldoAdicional;

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
