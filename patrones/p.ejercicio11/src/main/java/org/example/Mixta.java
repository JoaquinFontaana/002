package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Mixta extends Topografia{
    private ArrayList<Topografia> componentes;

    public Mixta(ArrayList<Topografia> componentes) {
        if (componentes == null || componentes.size() != 4) {
            throw new IllegalArgumentException("La topografía mixta necesita 4 componente");
        }
        this.componentes = componentes;
    }

    @Override
    public boolean comparar(Topografia topografia) {
        if (topografia.getClass() != this.getClass()){
            return false;
        }
        return this.componentes.equals(topografia.getChilds());
    }

    @Override
    public double calcularProporcionAgua() {
        return this.promedio(this.componentes.stream()
                .mapToDouble(componente -> componente.calcularProporcionAgua()));
    }

    @Override
    public double calcularProporcionTierra() {
        return this.promedio(this.componentes.stream()
                .mapToDouble(componente -> componente.calcularProporcionTierra()));
    }

    private double promedio(DoubleStream stream){
        return stream.average()
                .orElseThrow(() -> new RuntimeException("La topografía no puede estar vacía"));
    }
    @Override
    public List<Topografia> getChilds() {
        return new ArrayList<>(this.componentes);
    }
}
