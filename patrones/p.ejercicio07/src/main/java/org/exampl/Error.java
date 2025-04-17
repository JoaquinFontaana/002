package org.exampl;

public class Error implements EstadoCalculadora{
    public Error(Calculadora calculadora){
        calculadora.setResultadoActual("error");
    }

    @Override
    public void mas(Calculadora calculadora) {

    }

    @Override
    public void menos(Calculadora calculadora) {

    }

    @Override
    public void por(Calculadora calculadora) {

    }

    @Override
    public void dividido(Calculadora calculadora) {

    }

    @Override
    public void setValor(double valor, Calculadora calculadora) {

    }

    @Override
    public String getResultado(Calculadora calculadora) {
        return calculadora.getResultadoActual();
    }
}
