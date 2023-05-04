package structure.composite;

public class File extends AbstractFile{

    public File(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public String getTreeFolder(String prefix, StringBuilder builder) {
        return name;
    }
}
