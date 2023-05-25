package bo_sung.composite;

public class NutLa implements TreeNode{
    private int value;

    public NutLa(int value) {
        this.value = value;
    }

    @Override
    public void duyetCay(int depth) {
//        System.out.println("Giá trị của nút lá: " + value);
        whiteSpace(depth);
        System.out.println("- " + value);
    }

    private void whiteSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
    }
}
