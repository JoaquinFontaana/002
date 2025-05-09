package org.example;

import java.util.List;

public class Tierra extends Topografia{
    private double proporcionAgua = 0;
    private double proporcionTierra = 1;
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
