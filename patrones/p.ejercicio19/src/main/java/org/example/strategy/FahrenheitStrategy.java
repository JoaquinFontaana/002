package org.example.strategy;

public class FahrenheitStrategy implements FormatoTemperaturaStrategy{
    @Override
    public double formatearFahrenheit(double temperaturaFahrenheit) {
        return temperaturaFahrenheit;
    }
}
