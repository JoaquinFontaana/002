package fileManager;

public class tamañoDecorator extends AtributoDecorator{
    public tamañoDecorator(FormatFile formatFile) {
        super(formatFile);
    }

    @Override
    public String concretePrettyPint() {
        return this.getTamaño().toString();
    }
}
