package org.example.decorator;

public interface DisplayDataComponent {

    public double getPresion();

    public double getRadiacionSolar();

    public double promedioTemperatura();

    public double temperaturaMinima();

    public double temperaturaMaxima();

    //retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData();
}
