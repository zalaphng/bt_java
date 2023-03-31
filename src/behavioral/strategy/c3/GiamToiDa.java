package behavioral.strategy.c3;

public class GiamToiDa implements IKhuyenMai{
    int maxGiamDonHang = 12000;
    @Override
    public double soTienKM(double tongTien) {
        return maxGiamDonHang;
    }
}
