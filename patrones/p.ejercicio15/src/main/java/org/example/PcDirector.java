package org.example;

public class PcDirector {
    private PcBuilder builder;

    public PcDirector(PcBuilder builder) {
        this.builder = builder;
    }
    public void construct(){
        this.builder.agregarProcesador();
        this.builder.agregarAlmacenamiento();
        this.builder.agregarRam();
        this.builder.agregarTarjetaGrafica();
        this.builder.agregarGabinete();
    }
}
