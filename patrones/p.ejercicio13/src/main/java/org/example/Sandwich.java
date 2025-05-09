package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sandwich  implements SandwichComponent{
    private List<SandwichComponent> ingredientes;

    public Sandwich() {
        this.ingredientes = new ArrayList<>();
    }

    @Override
    public double calcularPrecio() {
        return this.ingredientes.stream().mapToDouble(SandwichComponent::calcularPrecio).sum();
    }

    @Override
    public void agregarIngrediente(SandwichComponent ingrediente) {
        this.ingredientes.add(ingrediente);
    }

}
