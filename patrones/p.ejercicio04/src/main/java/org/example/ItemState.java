package org.example;

import java.time.Duration;

public interface ItemState {
    public void finish(ToDoItem context);
    public Duration workedTime(ToDoItem context);
    public boolean addComment();
    public void start (ToDoItem context);
    public void togglePause(ToDoItem context);
    
}
