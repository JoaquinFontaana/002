package fileManager;

public class FechaCreacionDecorator extends AtributoDecorator{
    public FechaCreacionDecorator(FormatFile formatFile) {
        super(formatFile);
    }

    @Override
    public String concretePrettyPint() {
        return this.getFechaCreacion().toString();
    }
}
