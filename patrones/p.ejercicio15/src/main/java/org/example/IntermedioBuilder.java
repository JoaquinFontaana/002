package org.example;

public class IntermedioBuilder extends PcBuilder{
    @Override
    public void agregarProcesador() {
        this.agregarComponente("Procesador intermedio");
    }

    @Override
    public void agregarGabinete() {
        this.agregarComponente("Gabinete Intermedio");
        this.agregarComponente("Fuente 800 w");
    }

    @Override
    public void agregarAlmacenamiento() {
        this.agregarComponente("SSD 500GB");
    }

    @Override
    public void agregarTarjetaGrafica() {
        this.agregarComponente("GTX 1650");
    }

    @Override
    public void agregarRam() {
        this.agregarComponente("Memoria RAM16GB");
    }
}
