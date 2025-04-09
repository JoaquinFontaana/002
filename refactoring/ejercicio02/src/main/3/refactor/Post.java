package refactor;

import java.time.LocalDate;

public class Post {
    private String texto;
    private LocalDate fecha;
    private Usuario usuario;
    public LocalDate getFecha() {
        return fecha;
    }

    public String getTexto() {
        return texto;
    }

    public boolean esDeUsuario(Usuario usuario){
        if(this.usuario.getUsername().equals(usuario.getUsername())){
            return true;
        }
        return false;
    }
}
