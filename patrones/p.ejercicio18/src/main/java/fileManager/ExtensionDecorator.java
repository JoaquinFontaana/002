package fileManager;

public class ExtensionDecorator extends AtributoDecorator{
    public ExtensionDecorator(FormatFile formatFile) {
        super(formatFile);
    }

    @Override
    public String concretePrettyPint() {
        return this.getExtension();
    }

}
