package fileManager;

import java.time.LocalDate;

public interface FormatFile {
    String prettyPint();
    String getExtension();
    Integer getTamaño();
    LocalDate getFechaCreacion();
    LocalDate getFechaModificacion();
    String getPermisos();
}
