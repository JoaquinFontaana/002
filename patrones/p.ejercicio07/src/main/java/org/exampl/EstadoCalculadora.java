package org.exampl;

public interface EstadoCalculadora {
    public void mas(Calculadora calculadora);
    public void menos(Calculadora calculadora);
    public void por(Calculadora calculadora);
    public void dividido(Calculadora calculadora);
    public void setValor(double valor,Calculadora calculadora);
    public String getResultado(Calculadora calculadora);
}
