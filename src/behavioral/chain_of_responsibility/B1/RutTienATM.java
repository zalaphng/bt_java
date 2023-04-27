package behavioral.chain_of_responsibility.B1;

public abstract class RutTienATM{
    public IRutTienATM rutTien(int tongTien, int menhGiaCaoNhat){
        IRutTienATM rutTien = factory(menhGiaCaoNhat);
        rutTien.rutTien(tongTien);
        return rutTien;
    };

    public abstract IRutTienATM factory(int menhGia);
}
