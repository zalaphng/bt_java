package behavioral.observer.A3_TiGia;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(TiGia t){
        t.detach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if (delta > 500){
            System.out.printf("\nB: Bán");
        } else {
            System.out.printf("\nB: Mua");
        }
    }
}
