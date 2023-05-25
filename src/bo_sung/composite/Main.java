package bo_sung.composite;

public class Main {
    public static void main(String[] args) {
        TreeNode leaf1 = new NutLa(1);
        TreeNode leaf2 = new NutLa(2);
        TreeNode leaf3 = new NutLa(3);
        TreeNode leaf4 = new NutLa(4);
        TreeNode leaf5 = new NutLa(5);

        TreeNode composite1 = new NutGoc(6, leaf1, leaf2);
        TreeNode composite2 = new NutGoc(7, leaf3, leaf4);

        TreeNode root = new NutGoc(8, composite1, composite2);

        root.duyetCay(0);
    }
}
