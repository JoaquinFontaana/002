package org.example;

public class IngredienteSandwich implements SandwichComponent{
    private double precio;

    public IngredienteSandwich(double precio) {
        this.precio = precio;
    }

    @Override
    public void agregarIngrediente(SandwichComponent ingrediente) {

    }
    @Override
    public double calcularPrecio() {
        return this.precio;
    }
}
