package org.example;

public abstract class SandwichBuilder {
    private SandwichComponent sandwich;
    public void crearSandwich(){
        this.sandwich = new Sandwich();
    }
    public abstract void agregarPrincipal();
    public abstract void agregarAdicional();
    public abstract void agregarAderezo();
    public abstract void agregarPan();
    public SandwichComponent getSandwich(){
        return this.sandwich;
    }
}
