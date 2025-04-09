package refactor;

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;

    public void incrementar(int cantidad){
        this.puntuacion += cantidad;

    }
    public void decrementar(int cantidad){
        this.puntuacion -= cantidad;
    }
}
