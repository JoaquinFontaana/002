package org.example;

public class VeganoBuilder extends SandwichBuilder{

    @Override
    public void agregarPan() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(100));
    }

    @Override
    public void agregarAderezo() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(20));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(500));
    }

    @Override
    public void agregarAdicional() {

    }
}
