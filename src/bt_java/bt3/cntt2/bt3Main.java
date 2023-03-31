package bt_java.bt3.cntt2;

public class bt3Main {
    public static void main(String[] args) {
        SinhVienBiz sbBiz = new SinhVienBiz("Hoàng A", "Kinh Te",  7,8);
        SinhVienBiz sbBiz1 = new SinhVienBiz("Hoàng B", "Kinh Te",  5,6);
        SinhVienBiz sbBiz2 = new SinhVienBiz("Hoàng C", "Kinh Te",  4, 3);
        sbBiz.xuat();
        System.out.printf("\n=========================");
        sbBiz1.xuat();
        System.out.printf("\n=========================");
        sbBiz2.xuat();
    }
}
