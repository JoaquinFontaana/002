package org.example.strategy;

public class CelciusStrategy implements FormatoTemperaturaStrategy{
    @Override
    public double formatearFahrenheit(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32)/1.8;
    }
}
