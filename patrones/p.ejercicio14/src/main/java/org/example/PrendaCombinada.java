package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada extends Prenda{
    private List<Prenda> prendas;

    public PrendaCombinada() {
        super(0.5);
        this.prendas = new ArrayList<>();
    }

    @Override
    public void agregarPrenda(Prenda prenda) {
        this.prendas.add(prenda);
    }

    @Override
    public double calcularValor() {
        return this.prendas.stream().mapToDouble(Prenda::calcularValor).sum();
    }
}
