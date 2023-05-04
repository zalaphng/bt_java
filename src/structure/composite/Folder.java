package structure.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Folder extends AbstractFile{

    List<AbstractFile> children = new ArrayList<AbstractFile>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFile file) {
        children.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        children.remove(file);
    }

    @Override
    public String getTreeFolder(String prefix, StringBuilder result) {
        result.append(prefix).append("└── ").append(name).append("\n");
        prefix += "    ";

        for (AbstractFile c: children) {
            if (c instanceof File) {
                result.append(prefix).append("└── " + c.getTreeFolder("", result)).append("\n");
            } else {
                c.getTreeFolder(prefix, result);
            }
//            builder.append("\n");
//            builder.append("..");
//            builder.append(c.getTreeFolder());
        }
        return result.toString();
    }
}
