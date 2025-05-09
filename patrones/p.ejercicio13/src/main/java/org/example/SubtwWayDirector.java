package org.example;

public class SubtwWayDirector {
    private SandwichBuilder builder;

    public SubtwWayDirector(SandwichBuilder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.crearSandwich();
        builder.agregarPan();
        builder.agregarAderezo();
        builder.agregarPrincipal();
        builder.agregarAdicional();
    }

}
