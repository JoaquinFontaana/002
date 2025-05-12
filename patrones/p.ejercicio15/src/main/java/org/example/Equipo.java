package org.example;

import java.util.List;

public class Equipo implements PcComponent{

    private List<Componente> componentes;

    @Override
    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    @Override
    public double calcularConsumo() {
        return this.componentes.stream().mapToDouble(Componente::calcularConsumo).sum();
    }

    @Override
    public double calcularPrecio() {
        return this.componentes.stream().mapToDouble(Componente::calcularPrecio).sum();
    }

}
