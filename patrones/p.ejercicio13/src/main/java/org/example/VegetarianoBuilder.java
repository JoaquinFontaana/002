package org.example;

public class VegetarianoBuilder extends SandwichBuilder{
    /*
    consta de pan con semillas (120 pesos), sin aderezo,
    principal de provoleta grillada (200 pesos) y adicional de berenjenas al escabeche (100 pesos).

     */
    @Override
    public void agregarPan() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(120));
    }

    @Override
    public void agregarAderezo() {

    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(200));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().agregarIngrediente(new IngredienteSandwich(100));
    }
}
