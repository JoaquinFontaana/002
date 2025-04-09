package org.example;

public class EmpleadoPlanta extends EmpleadoFormal{
    private int añosDeAntiguedad;

    public EmpleadoPlanta(double sueldoBasico, boolean casado, int cantidadHijos, int añosDeAntiguedad) {
        super(sueldoBasico, casado, cantidadHijos);
        this.añosDeAntiguedad = añosDeAntiguedad;
    }

    @Override
    public double adicionalesExtra() {
        return this.añosDeAntiguedad * 2000;
    }
}
