package bt_java.bt1;

public class bt1Main {
    public static void main(String[] args) {

        NhanVien nv = new NhanVien("A", "1", "AAA", 10000, 100);
        NhanVien nv1 = new NhanVien("B", "1", "AAA", 10000, 200);

        System.out.printf("NhanVien 1:\n" + nv + "\n");
        System.out.printf("NhanVien 2:\n" + nv1);
        
    }
}
