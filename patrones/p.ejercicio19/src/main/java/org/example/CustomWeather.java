package org.example;

import org.example.decorator.DisplayDataComponent;
import org.example.strategy.FormatoTemperaturaStrategy;

import java.util.List;

public class CustomWeather implements WeatherData, DisplayDataComponent {
    private HomeWeatherStation homeWeatherStation;
    private FormatoTemperaturaStrategy formatoTemperaturaStrategy;

    public void setFormatoTemperaturaStrategy(FormatoTemperaturaStrategy strategy){
        this.formatoTemperaturaStrategy = strategy;
    }

    @Override
    public double getPresion() {
        return this.homeWeatherStation.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.homeWeatherStation.getRadiacionSolar();
    }

    @Override
    public double getTemperatura() {
        return this.formatoTemperaturaStrategy.formatearFahrenheit(this.homeWeatherStation.getTemperatura());
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.homeWeatherStation.getTemperaturas().stream()
                .map(temperatura -> this.formatoTemperaturaStrategy.formatearFahrenheit(temperatura))
                .toList();
    }

    public double promedioTemperatura() {
        return this.getTemperaturas().stream()
                .mapToDouble(t -> t)
                .average()
                .orElseThrow(() -> new RuntimeException("No hay temperaturas registradas"));
    }
    public double temperaturaMinima(){
        return  this.getTemperaturas().stream()
                .mapToDouble(t -> t)
                .min()
                .orElseThrow(() -> new RuntimeException("No hay temperaturas registradas"));
    }

    public double temperaturaMaxima(){
        return  this.getTemperaturas().stream()
                .mapToDouble(t -> t)
                .max()
                .orElseThrow(() -> new RuntimeException("No hay temperaturas registradas"));
    }

    @Override
    public String displayData() {
        return Double.toString(this.getTemperatura());
    }
}
