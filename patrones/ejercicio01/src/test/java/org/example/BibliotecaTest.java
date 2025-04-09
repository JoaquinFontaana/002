package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    public void setup(){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
        this.biblioteca = biblioteca;
    }
    @Test
    public void testBiliotecaExportarSocios(){
        String jsonEsperado = """
            [
                {
                \t"nombre": "Arya Stark",
                \t"email": "needle@stark.com",
                \t"legajo": "5234-5"
                },
                {
                \t"nombre": "Tyron Lannister",
                \t"email": "tyron@thelannisters.com",
                \t"legajo": "2345-2"
                }
            ]""";
        assertEquals(jsonEsperado,biblioteca.exportarSocios());
    }
}
