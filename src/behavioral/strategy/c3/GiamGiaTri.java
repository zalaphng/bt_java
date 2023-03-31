package behavioral.strategy.c3;

public class GiamGiaTri implements IKhuyenMai{
    int phanTramKM = 10;
    @Override
    public double soTienKM(double tongTien) {
        return tongTien * (phanTramKM / 100);
    }
}
