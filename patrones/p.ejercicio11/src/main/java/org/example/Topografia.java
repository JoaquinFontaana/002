package org.example;

import java.util.List;

public abstract class Topografia {
    public abstract boolean comparar(Topografia topografia);
    public abstract double calcularProporcionAgua();
    public abstract List<Topografia> getChilds();
    public abstract double calcularProporcionTierra();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topografia)){
            return false;
        }
        return this.comparar((Topografia) obj);
    }
}
