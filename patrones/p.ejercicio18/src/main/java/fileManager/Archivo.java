package fileManager;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Archivo implements FormatFile{

    private String nombre;
    private String extension;
    private Integer tamaño;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    @Override
    public String prettyPint() {
        return this.getNombre();
    }

}
