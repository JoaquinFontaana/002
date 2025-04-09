package org.example;

public abstract class EmpleadoFormal extends Empleado{
    private boolean casado;
    private int cantidadHijos;

    public double calcularAdicionales(){
        return this.cantidadHijos * 2000 + this.adicionalCasado() + this.adicionalesExtra();
    }
    private double adicionalCasado(){
        if(this.casado){
            return 5000;
        }
        return 0;
    }

    public abstract double adicionalesExtra();
}
