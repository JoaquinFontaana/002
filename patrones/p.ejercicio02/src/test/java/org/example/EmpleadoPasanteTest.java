package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoPasanteTest {

    private EmpleadoPasante empleado;

    @BeforeEach
    public void setUp(){
        this.empleado = new EmpleadoPasante(100,2);

    }
    @Test
    public void sueldoTest(){
        double sueldo = this.empleado.sueldo();
        assertEquals(3887,sueldo);
    }
}
