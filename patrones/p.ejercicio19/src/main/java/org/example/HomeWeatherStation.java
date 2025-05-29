package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura(){
        return 86;
    }

    //retorna la presión atmosférica en hPa
    public double getPresion(){
        return 1008;
    }

    //retorna la radiación solar
    public double getRadiacionSolar(){
        return 200;
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas(){
        ArrayList<Double> temperaturas =  new ArrayList<>();
        temperaturas.add(27.0);
        temperaturas.add(29.0);
        temperaturas.add(32.0);
        return temperaturas;
    }

    //retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
                "Presión atmosf: " + this.getPresion() +
                "Radiación solar: " + this.getRadiacionSolar();
    }
}
