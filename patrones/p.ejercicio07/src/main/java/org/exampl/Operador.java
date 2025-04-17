package org.exampl;

public abstract class Operador implements EstadoCalculadora{
    @Override
    public void setValor(double valor, Calculadora calculadora) {
        Double resultado = this.realizarOperacion(calculadora.getOperando(),valor);
        if(resultado == null) {
            calculadora.setEstado(new Error(calculadora));
        }
        else {
            calculadora.sumarAlAcumulado(resultado);
            calculadora.setResultadoActual(resultado.toString());
            calculadora.setEstado(new Esperando());
            calculadora.setOperando(0);
        }
    }

    public abstract Double realizarOperacion(double operando1,double operando2);

    @Override
    public String getResultado(Calculadora calculadora) {
        calculadora.setEstado(new Error(calculadora));
        return calculadora.getResultado();
    }

    @Override
    public void por(Calculadora calculadora) {
        calculadora.setEstado(new Error(calculadora));
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setEstado(new Error(calculadora));
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setEstado(new Error(calculadora));
    }

    @Override
    public void dividido(Calculadora calculadora) {
        calculadora.setEstado(new Error(calculadora));
    }
}
