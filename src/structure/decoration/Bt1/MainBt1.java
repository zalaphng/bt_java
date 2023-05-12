package structure.decoration.Bt1;

public class MainBt1 {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(6);
        b = new Cong(b, 9);
        b = new Nhan(b, 8);
        b = new Cong(b, 5);
        System.out.printf(b.bieuThuc() + " = " + b.giaTri());

        System.out.printf("\n");

        BieuThuc b1 = new BieuThucDonGian(6);
        b1 = new BieuThucDonGian(8);
        b1 = new Cong(b1, 6);
        b1 = new Chia(b1, 2);
        b1 = new Nhan(b1, 5);
        b1 = new Cong(b1, 8);
        b1 = new Tru(b1, 4);
        System.out.printf(b1.bieuThuc() + " = " + b1.giaTri());

        System.out.printf("\n");

        // abs
        BieuThuc b2 = new BieuThucDonGian(6);
        b2 = new Tru(b2, 12);
        b2 = new Abs(b2);
        System.out.printf(b2.bieuThuc() + " = " + b2.giaTri());
    }
}
