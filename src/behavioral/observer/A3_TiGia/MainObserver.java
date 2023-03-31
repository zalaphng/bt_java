package behavioral.observer.A3_TiGia;

public class MainObserver{
    public static void main(String[] args) {
        TiGia t = new TiGia();

        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);

        System.out.printf("Lần 1:");
        t.notifyTiGia(-5);
        System.out.printf("\nLần 2");
        a.huyDangKy();
        t.notifyTiGia(5);
    }
}
