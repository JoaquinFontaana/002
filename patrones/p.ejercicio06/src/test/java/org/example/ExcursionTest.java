package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcursionTest {
    private Excursion excursion;

    @BeforeEach
    public void setUp(){
        this.excursion = new Excursion(10,
                "Dos días en kayak bajando el Paraná",
                2,
                1,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(4),
                "Parana");
        Usuario user1 = new Usuario("Joaquin","Fontana","hola@gmail.com");
        Usuario user2 = new Usuario("Sebastian","Kayak","boludo@gmail.com");
        this.excursion.inscribirUsuario(user1);
        this.excursion.inscribirUsuario(user2);
    }
    @Test
    public void inscribirExcursionLlenaTest(){
        Usuario user = new Usuario("Lorenzo","Fontana","lorenzo@gmail.com");
        assertEquals(2,this.excursion.getCantidadInscriptos());
        excursion.inscribirUsuario(user);
        assertEquals(2,this.excursion.getCantidadInscriptos());
        assertEquals(1,this.excursion.getCantidadListaEspera());
    }
}
