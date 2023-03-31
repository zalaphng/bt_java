package behavioral.strategy.c1;

public class c1Main {
    public static void main(String[] args) {
        TinhToan test = new TinhToan();

        test.setTinhToan(new Tru());
        System.out.printf("\n" + test.tinh(75, 12));

        test.setTinhToan(new Cong());
        System.out.printf("\n" + test.tinh(54, 78));
    }
}
