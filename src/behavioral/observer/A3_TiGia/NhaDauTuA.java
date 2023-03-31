package behavioral.observer.A3_TiGia;


public class NhaDauTuA implements TiGia.I_TheoDoiTiGia {
    TiGia t;

    public NhaDauTuA(TiGia t){
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(){
        t.detach(this);
    }


    @Override
    public void capNhatTiGia(float delta) {
        if (delta > 0)
            System.out.printf("\nA: Bán ra");
        else
            System.out.printf("\nA: Mua vào");
    }
}
