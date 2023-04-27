package behavioral.chain_of_responsibility.B1;

public class RutTienATMVND extends RutTienATM{
    IRutTienATM iRutTienATM;

    @Override
    public IRutTienATM factory(int menhGia) {
        IRutTienATM M500 = new RutTienTheoMenhGia(500);
        IRutTienATM M100 = new RutTienTheoMenhGia(100);
        IRutTienATM M50 = new RutTienTheoMenhGia(50);
        IRutTienATM M10 = new RutTienTheoMenhGia(10);
        IRutTienATM M1 = new RutTienTheoMenhGia(1);

        M500
            .menhGiaThapHon(M100)
            .menhGiaThapHon(M50)
            .menhGiaThapHon(M10)
            .menhGiaThapHon(M1);

        switch(menhGia){
            case 500:
                iRutTienATM = M500;
                break;
            case 100:
                iRutTienATM = M100;
                break;
            case 50:
                iRutTienATM = M50;
                break;
            case 10:
                iRutTienATM = M10;
                break;
            case 1:
                iRutTienATM = M1;
                break;
            default:
                iRutTienATM = M500;
        }

        return iRutTienATM;
    }

    @Override
    public IRutTienATM rutTien(int tongTien, int menhGiaCaoNhat) {
        return super.rutTien(tongTien, menhGiaCaoNhat);
    }
}
