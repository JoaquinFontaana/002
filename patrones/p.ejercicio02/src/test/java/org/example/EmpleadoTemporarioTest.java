package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTemporarioTest {
    private EmpleadoTemporario empleado;
    @BeforeEach
    public void setUp(){
        this.empleado  = new EmpleadoTemporario(100,true,2);
    }
    @Test
    public void sueldoTest(){
        double adicionales = 5000 + 2 * 2000;
        double adicionalesConDescuento = adicionales - adicionales * 0.05;
        double sueldoEsperado = 87 + adicionalesConDescuento;
        assertEquals(sueldoEsperado,empleado.sueldo());
    }
}
