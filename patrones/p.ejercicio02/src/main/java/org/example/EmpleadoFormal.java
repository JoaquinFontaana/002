package org.example;

public abstract class EmpleadoFormal extends Empleado{
    private boolean casado;
    private int cantidadHijos;

    public EmpleadoFormal(double sueldoBasico, boolean casado, int cantidadHijos) {
        super(sueldoBasico);
        this.casado = casado;
        this.cantidadHijos = cantidadHijos;
    }

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
