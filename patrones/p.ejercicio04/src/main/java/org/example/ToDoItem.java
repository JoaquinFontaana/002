package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class ToDoItem {
    private List<String> comments;
    private ItemState state;
    private String name;
    private Duration workedTime;
    private Instant startTime;

    public ToDoItem (String name){
        this.name = name;
        this.state = new Pending();
        this.comments = new ArrayList<>();
        this.workedTime = Duration.ZERO;
    }
    public void setState(ItemState state){
        this.state = state;
    }
    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start(){
        this.state.start(this);
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause(){
        this.state.togglePause(this);
    }


    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish(){
        this.state.finish(this);
    }


    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime() {
        return this.state.workedTime(this);
    }


    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada."
     */
    public void addComment(String comment){
        if(this.state.addComment()){
            this.comments.add(comment);
        }
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Duration getWorkedTime() {
        return workedTime;
    }

    public void setWorkedTime(Duration workedTime) {
        this.workedTime = workedTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
    public void sumarTiempo(){
        if (startTime != null) {
            Duration duracion = Duration.between(startTime, Instant.now());
            workedTime = workedTime.plus(duracion);
            startTime = null;
        }
    }

    public ItemState getState() {
        return state;
    }
}
