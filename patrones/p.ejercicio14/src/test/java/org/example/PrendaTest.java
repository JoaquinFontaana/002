package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTest {
    private Prenda prendaCombinada;
    private Prenda automovil;
    private Prenda alquiler;

    @BeforeEach
    public void setUp(){
        this.prendaCombinada = new PrendaCombinada();
        this.automovil = new Automovil(100000,20,Year.of(2020));
        this.alquiler = new Alquiler(LocalDate.of(2025,3,1),1000,LocalDate.now());
    }

    @Test
    public void prendaCombinadaTest(){
        this.prendaCombinada.agregarPrenda(this.automovil);
        this.prendaCombinada.agregarPrenda(this.alquiler);
        assertEquals(52000,this.prendaCombinada.calcularValor());
        assertEquals(26000,this.prendaCombinada.calcularValorPrendario());
    }
    @Test
    public void automovilTest(){
        assertEquals(50000,this.automovil.calcularValor());
        assertEquals(50000*0.7,this.automovil.calcularValorPrendario());
    }
    @Test
    public void alquilerTest(){
        assertEquals(2000,this.alquiler.calcularValor());
        assertEquals(1800,this.alquiler.calcularValorPrendario());
    }
}
