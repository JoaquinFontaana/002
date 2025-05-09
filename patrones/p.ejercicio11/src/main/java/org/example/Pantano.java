package org.example;

import java.util.List;

public class Pantano extends Topografia{
    private double proporcionAgua = 0.7;
    private double proporcionTierra = 0.3;
    @Override
    public boolean comparar(Topografia topografia) {
        return this.getClass() == topografia.getClass();
    }

    @Override
    public double calcularProporcionAgua() {
        return this.proporcionAgua;
    }

    @Override
    public double calcularProporcionTierra() {
        return this.proporcionTierra;
    }

    @Override
    public List getChilds() {
        return null;
    }
}
