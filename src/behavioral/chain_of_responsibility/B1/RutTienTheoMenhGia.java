package behavioral.chain_of_responsibility.B1;

public class RutTienTheoMenhGia implements IRutTienATM {

    IRutTienATM menhGiaKeTiep;
    int menhGia;

    public RutTienTheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public double rutTien(int soTien) {
        int soTo = soTien/menhGia;
        if (soTo > 0){
            System.out.printf(soTo + " tờ mệnh giá " + menhGia + "\n");
        }
        int soDu = soTien % menhGia;
        if (soDu > 0)
            return menhGiaKeTiep.rutTien(soDu);
        return soDu;
    }

    @Override
    public IRutTienATM menhGiaThapHon(IRutTienATM menhGiaKeTiep) {
        this.menhGiaKeTiep = menhGiaKeTiep;
        return menhGiaKeTiep;
    }
}
