package org.example.decorator;

public class TemperaturaMinimaDecorator extends DisplayDataDecorator{
    @Override
    public String concrectDisplayData() {
        return Double.toString(this.temperaturaMinima());
    }

    public TemperaturaMinimaDecorator(DisplayDataComponent displayDataComponent) {
        super(displayDataComponent);
    }

}
