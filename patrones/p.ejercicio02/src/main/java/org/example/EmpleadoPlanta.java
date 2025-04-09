package org.example;

public class EmpleadoPlanta extends EmpleadoFormal{
    private int añosDeAntiguedad;
    @Override
    public double adicionalesExtra() {
        return this.añosDeAntiguedad * 2000;
    }
}
