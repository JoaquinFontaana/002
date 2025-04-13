package org.example;

import java.time.Duration;

public class Finished implements ItemState {
    @Override
    public Duration workedTime(ToDoItem context) {
        return context.getWorkedTime();
    }

    @Override
    public void start(ToDoItem context) {

    }

    @Override
    public void finish(ToDoItem context) {

    }

    @Override
    public void togglePause(ToDoItem context) {
        throw new RuntimeException("La tarea ya se ha terminado, no se puede cambiar el estado");
    }

    @Override
    public boolean addComment() {
        return false;
    }
}
