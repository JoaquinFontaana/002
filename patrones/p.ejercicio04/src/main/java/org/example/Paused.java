package org.example;

import java.time.Duration;
import java.time.Instant;

public class Paused implements ItemState{
    @Override
    public void togglePause(ToDoItem context) {
        context.setStartTime(Instant.now());
        context.setState(new InProgress());
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        return context.getWorkedTime();
    }

    @Override
    public boolean addComment() {
        return true;
    }

    @Override
    public void finish(ToDoItem context) {
        context.setState(new Finished());
    }

    @Override
    public void start(ToDoItem context) {

    }
}
