package org.example.decorator;

public abstract class DisplayDataDecorator implements DisplayDataComponent{
    private DisplayDataComponent displayDataComponent;

    public DisplayDataDecorator(DisplayDataComponent displayDataComponent) {
        this.displayDataComponent = displayDataComponent;
    }

    @Override
    public String displayData() {
        return this.displayDataComponent.displayData() + this.concrectDisplayData();
    }

    public abstract String concrectDisplayData();

    @Override
    public double getPresion() {
        return this.displayDataComponent.getPresion();
    }

    @Override
    public double promedioTemperatura() {
        return this.displayDataComponent.promedioTemperatura();
    }

    @Override
    public double temperaturaMaxima() {
        return this.displayDataComponent.temperaturaMaxima();
    }

    @Override
    public double temperaturaMinima() {
        return this.displayDataComponent.temperaturaMinima();
    }

    @Override
    public double getRadiacionSolar() {
        return this.displayDataComponent.getRadiacionSolar();
    }

    public DisplayDataComponent getDisplayDataComponent() {
        return displayDataComponent;
    }


}
