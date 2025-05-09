package org.example;

import java.util.List;

public class Agua extends Topografia{
    private double proporcionAgua = 1;
    private double proporcionTierra = 0;

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
