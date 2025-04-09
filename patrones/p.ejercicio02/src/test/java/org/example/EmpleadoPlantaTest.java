package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoPlantaTest {
    private EmpleadoPlanta empleado;
    @BeforeEach
    public void setUp(){
        this.empleado = new EmpleadoPlanta(100,true,1,2);
    }
    @Test
    public void sueldoTest(){
        double sueldo = this.empleado.sueldo();
        double adicionales = 5000 + 2000 + 4000;
        adicionales = adicionales - adicionales * 0.05;
        double sueldoEsperado = 87 + adicionales;
        assertEquals(sueldoEsperado,sueldo);
    }
}
