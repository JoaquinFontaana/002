package org.exampl;

public class Dividido extends Operador{

    @Override
    public Double realizarOperacion(double operando1,double operando2) {
        if(operando2 == 0){
            return null;
        }
        return operando1 / operando2;
    }
}
