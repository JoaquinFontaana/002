package org.exampl;

public class Menos extends Operador{
    @Override
    public Double realizarOperacion(double operando1,double operando2) {
        return operando1 - operando2;
    }
}
