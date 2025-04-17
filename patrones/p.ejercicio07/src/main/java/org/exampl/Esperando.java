package org.exampl;

public class Esperando implements EstadoCalculadora{

    @Override
    public void setValor(double valor,Calculadora calculadora) {
        calculadora.setOperando(valor);
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setEstado(new Por());
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setEstado(new Menos());
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setEstado(new Mas());
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setEstado(new Dividido());
    }

    @Override
    public String getResultado(Calculadora calculadora) {
        return calculadora.getResultadoActual().isEmpty()
                ? calculadora.getValorAcumulado().toString()
                : calculadora.getResultadoActual();
    }
}
