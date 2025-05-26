package fileManager;

public class PermisosDecorator extends AtributoDecorator{
    public PermisosDecorator(FormatFile formatFile) {
        super(formatFile);
    }

    @Override
    public String concretePrettyPint() {
        return this.getPermisos();
    }
}
