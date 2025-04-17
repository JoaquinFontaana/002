package org.exampl;

public class Calculadora {
    private EstadoCalculadora estado;
    private double valorAcumulado;
    private String resultadoActual;
    private double operando;

    public Calculadora(){
        this.estado = new Esperando();
        this.valorAcumulado = 0;
        this.operando = 0;
        this.resultadoActual = "";
    }

    public void borrar(){
        this.valorAcumulado = 0;
        this.operando = 0;
        this.resultadoActual = "";
        this.estado = new Esperando();
    }
    public String getResultado(){
        return this.estado.getResultado(this);
    }
    public void setValor(double numero){
        estado.setValor(numero,this);
    }
    public void menos(){
        estado.menos(this);
    }
    public void por(){
        estado.por(this);
    }
    public void mas(){
        estado.mas(this);
    }
    public void dividido(){
        estado.dividido(this);
    }

    public void setResultadoActual(String resultado) {
        this.resultadoActual = resultado;
    }

    public Double getValorAcumulado() {
        return valorAcumulado;
    }

    public void setOperando(double operando) {
        this.operando = operando;
    }

    public double getOperando() {
        return operando;
    }

    public void sumarAlAcumulado(double valor) {
        this.valorAcumulado += valor;
    }

    public String getResultadoActual() {
        return resultadoActual;
    }

    public void setEstado(EstadoCalculadora estado) {
        this.estado = estado;
    }
}
