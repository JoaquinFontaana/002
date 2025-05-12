package org.example;

public class SinTACCBuilder extends SandwichBuilder{
    @Override
    public void agregarAderezo() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(18));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(200));
    }

    @Override
    public void agregarPan() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(150));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(250));
    }
}
/*
consta de pan de chipá (150 pesos),
aderezo de salsa tártara (18 pesos),
principal de carne de pollo (250 pesos) y adicional de verduras grilladas (200 pesos).

 */