package org.example.decorator;

public class PresionDecorator extends DisplayDataDecorator{
    @Override
    public String concrectDisplayData() {
        return Double.toString(this.getPresion());
    }

    public PresionDecorator(DisplayDataComponent displayDataComponent) {
        super(displayDataComponent);
    }
}
