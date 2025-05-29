package org.example.decorator;

public class TemperaturaMaximaDecorator extends DisplayDataDecorator{
    @Override
    public String concrectDisplayData() {
        return Double.toString(this.temperaturaMaxima());
    }

    public TemperaturaMaximaDecorator(DisplayDataComponent displayDataComponent) {
        super(displayDataComponent);
    }
}
