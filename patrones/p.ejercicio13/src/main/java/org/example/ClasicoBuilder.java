package org.example;

public class ClasicoBuilder extends SandwichBuilder{
    @Override
    public void agregarAderezo() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(20));
    }

    @Override
    public void agregarAdicional() {

    }

    @Override
    public void agregarPan() {

    }

    @Override
    public void agregarPrincipal() {

    }
}
