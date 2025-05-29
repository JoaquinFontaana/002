package org.example.decorator;

public class RadiacionSolarDecorator extends DisplayDataDecorator{
    @Override
    public String concrectDisplayData() {
        return Double.toString(this.getRadiacionSolar());
    }

    public RadiacionSolarDecorator(DisplayDataComponent displayDataComponent) {
        super(displayDataComponent);
    }
}
