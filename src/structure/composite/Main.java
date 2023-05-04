package structure.composite;

public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("root");

        Folder folder1 = new Folder("java");
        folder1.add(new File("test.java"));
//        System.out.printf(java.getTreeFolder());

        Folder src = new Folder("src");
        src.add(new File("main.java"));

        Folder folder2 = new Folder("Main");
        folder2.add(src);
        folder2.add(new File(".gitignore"));

        root.add(folder1);
        root.add(folder2);
        StringBuilder builder = new StringBuilder();
        System.out.printf(root.getTreeFolder("", builder));
    }
}
