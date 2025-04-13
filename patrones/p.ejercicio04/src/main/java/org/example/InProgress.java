package org.example;

import jdk.jshell.ImportSnippet;

import java.time.Duration;
import java.time.Instant;

public class InProgress implements ItemState{
    @Override
    public void togglePause(ToDoItem context) {
        context.sumarTiempo();
        context.setState(new Paused());
    }

    @Override
    public Duration workedTime(ToDoItem context) {
        context.sumarTiempo();
        context.setStartTime(Instant.now());
        return context.getWorkedTime();
    }

    @Override
    public void finish(ToDoItem context) {
        context.sumarTiempo();
        context.setState(new Finished());
    }

    @Override
    public void start(ToDoItem context) {

    }

    @Override
    public boolean addComment() {
        return true;
    }

}
