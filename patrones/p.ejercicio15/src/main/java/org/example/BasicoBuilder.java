package org.example;

public class BasicoBuilder extends PcBuilder{
    @Override
    public void agregarRam() {
        this.agregarComponente("Memoria ram 8GB");
    }

    @Override
    public void agregarProcesador() {
        this.agregarComponente("Procesador Basico"););
    }

    @Override
    public void agregarAlmacenamiento() {
        this.agregarComponente("Disco HDD 500GB");
    }

    @Override
    public void agregarTarjetaGrafica() {

    }

    @Override
    public void agregarGabinete() {
        this.agregarComponente("Gabinete Estandar");
    }

}
