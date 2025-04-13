package org.example;

import java.lang.module.Configuration;
import java.time.Duration;
import java.time.Instant;

public class Pending implements ItemState{
    @Override
    public void start(ToDoItem context) {
        context.setStartTime(Instant.now());
        context.setState(new InProgress());
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        throw new RuntimeException("La tarea todavia no se inicio, por lo que no hay tiempo trabajado");
    }

    @Override
    public void togglePause(ToDoItem context) {
        throw new RuntimeException("La tarea todavia no se inicio, no se puede poner en pausa");
    }

    @Override
    public boolean addComment() {
        return true;
    }

    @Override
    public void finish(ToDoItem context) {

    }
}
