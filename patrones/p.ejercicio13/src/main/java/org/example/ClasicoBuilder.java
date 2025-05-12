package org.example;

public class ClasicoBuilder extends SandwichBuilder{
    @Override
    public void agregarAderezo() {

        this.getSandwich().agregarIngrediente(new IngredienteSandwich(20));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(80));
    }

    @Override
    public void agregarPan() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(100));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(300));
    }
}
