package org.example.decorator;

public class TemperaturaPromedioDecorator extends DisplayDataDecorator{
    @Override
    public String concrectDisplayData() {
        return Double.toString(this.promedioTemperatura());
    }

    public TemperaturaPromedioDecorator(DisplayDataComponent displayDataComponent) {
        super(displayDataComponent);
    }
}
