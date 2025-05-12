package org.example;


public class GamerBuilder extends PcBuilder {
    @Override
    public void agregarTarjetaGrafica() {
        this.agregarComponente("RTX 4090");
    }

    @Override
    public void agregarProcesador() {
        this.agregarComponente("Procesador Gamer");
        this.agregarComponente("Pad termico");
        this.agregarComponente("cooler");
    }

    @Override
    public void agregarAlmacenamiento() {
        this.agregarComponente("SSD 500GB");
        this.agregarComponente("SSD 1TB");
    }

    @Override
    public void agregarGabinete() {
        this.agregarComponente("Gabinete Gamer");
        Double consumo = this.getResult().calcularConsumo() * 0.5;
        this.agregarComponente("fuente " + consumo.toString()+ " w");
    }

    @Override
    public void agregarRam() {
        this.agregarComponente("Memoria ram 32GB");
        this.agregarComponente("Memoria ram 32GB");
    }
}
