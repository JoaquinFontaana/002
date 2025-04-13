package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoItemTest {
    private ToDoItem tarea;

    @BeforeEach
    public void setUp() {
        tarea = new ToDoItem("Test");
    }

    @Test
    public void startTest() {
        this.tarea.start();
        assertEquals(new InProgress().getClass(), this.tarea.getState().getClass());
    }

    @Test
    public void togglePauseTest() {
        this.tarea.start();
        this.tarea.togglePause();
        assertEquals(new Paused().getClass(),tarea.getState().getClass());
    }
    @Test
    void workedTimeInProgressSumaCorrectamente() throws InterruptedException {
        tarea.start(); // cambia a InProgress
        Thread.sleep(100); // simulamos trabajo

        Duration tiempo = tarea.workedTime();

        assertTrue(tiempo.toMillis() >= 100, "workedTime debería haber sumado tiempo desde que inició");
    }

    @Test
    void workedTimePausedDevuelveAcumulado() throws InterruptedException {
        tarea.start();
        Thread.sleep(100);
        tarea.togglePause(); // pausa

        Duration tiempoEnPausa = tarea.workedTime();
        assertTrue(tiempoEnPausa.toMillis() >= 100);

        Thread.sleep(100);
        Duration tiempoDespuesDeEsperar = tarea.workedTime();

        // El tiempo no debería haber aumentado estando pausado
        assertEquals(tiempoEnPausa.toMillis(), tiempoDespuesDeEsperar.toMillis(), 10);
    }

    @Test
    void workedTimeAlternandoPausaYReinicio() throws InterruptedException {
        tarea.start();
        Thread.sleep(100);
        tarea.togglePause(); // Pausa
        Duration tiempo1 = tarea.workedTime();

        tarea.togglePause(); // Reanuda
        Thread.sleep(100);
        tarea.togglePause(); // Vuelve a pausar

        Duration tiempo2 = tarea.workedTime();

        assertTrue(tiempo2.toMillis() > tiempo1.toMillis());
    }

    @Test
    void workedTimeFinishedNoCambia() throws InterruptedException {
        tarea.start();
        Thread.sleep(100);
        tarea.finish(); // Cambia a Finished

        Duration tiempoFinal = tarea.workedTime();
        Thread.sleep(100);
        Duration tiempoPost = tarea.workedTime();

        assertEquals(tiempoFinal.toMillis(), tiempoPost.toMillis(), 10);
    }

    @Test
    void workedTimePendingLanzaError() {
        Exception e = assertThrows(RuntimeException.class, tarea::workedTime);
        assertEquals("La tarea todavia no se inicio, por lo que no hay tiempo trabajado", e.getMessage());
    }
}
