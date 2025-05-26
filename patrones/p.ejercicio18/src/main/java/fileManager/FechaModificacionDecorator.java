package fileManager;

public class FechaModificacionDecorator extends AtributoDecorator{
    public FechaModificacionDecorator(FormatFile formatFile) {
        super(formatFile);
    }

    @Override
    public String concretePrettyPint() {
        return this.getFechaModificacion().toString();
    }
}
