package bo_sung.composite;

public class NutGoc implements TreeNode{

    private int value;

    private TreeNode leftChild;
    private TreeNode rightChild;

    public NutGoc(int value, TreeNode leftChild, TreeNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void duyetCay(int depth) {
//        System.out.println("Giá trị của nút gốc: " + value);
//        System.out.println("Các nút con:");
//        if (leftChild != null) {
//            System.out.print("- Nút con bên trái: ");
//            leftChild.duyetCay();
//        }
//        if (rightChild != null) {
//            System.out.print("- Nút con bên phải: ");
//            rightChild.duyetCay();
//        }

        whiteSpace(depth);
        System.out.println("- " + value);

        if (leftChild != null) {
            leftChild.duyetCay(depth+1);
        }
        if (rightChild != null) {
            rightChild.duyetCay(depth+1);
        }
    }

    private void whiteSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
    }
}
