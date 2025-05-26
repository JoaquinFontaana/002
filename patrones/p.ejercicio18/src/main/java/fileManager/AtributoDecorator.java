package fileManager;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public abstract class AtributoDecorator implements FormatFile {
    private FormatFile formatFile;

    @Override
    public final String prettyPint() {
        String cadenaActual = this.concretePrettyPint();
        return cadenaActual + this.formatFile.prettyPint();
    }
    public abstract String concretePrettyPint();

    public AtributoDecorator(FormatFile formatFile) {
        this.formatFile = formatFile;
    }

    @Override
    public Integer getTamaño() {
        return this.formatFile.getTamaño();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return this.formatFile.getFechaCreacion();
    }

    @Override
    public String getExtension() {
        return this.formatFile.getExtension();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return this.getFechaCreacion();
    }

    @Override
    public String getPermisos() {
        return this.formatFile.getPermisos();
    }

}
