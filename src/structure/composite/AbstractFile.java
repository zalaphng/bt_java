package structure.composite;

public abstract class AbstractFile {
    String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract String getTreeFolder(String prefix, StringBuilder builder); //operation
}
