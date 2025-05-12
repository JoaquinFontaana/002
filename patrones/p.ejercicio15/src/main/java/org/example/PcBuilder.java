package org.example;

import java.time.LocalDate;

public abstract class PcBuilder {
    private PcComponent pc;
    private String nombreCliente;
    private LocalDate fecha;
    private Catalogo catalogo;

    public void iniciarPresupuesto(String nombreCliente,LocalDate fecha,Catalogo catalogo){
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.pc = new Equipo();
        this.catalogo = catalogo;
    }

    public abstract void agregarProcesador();
    public abstract void agregarRam();
    public abstract void agregarAlmacenamiento();
    public abstract void agregarTarjetaGrafica();
    public abstract void agregarGabinete();

    public void agregarComponente(String descripcionComponente){
        this.pc.agregarComponente(this.catalogo.getComponente(descripcionComponente));
    }

    public PcComponent getResult(){
        return this.pc;
    }
}
