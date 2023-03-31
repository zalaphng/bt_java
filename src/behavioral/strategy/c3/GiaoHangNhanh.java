package behavioral.strategy.c3;

public class GiaoHangNhanh implements IVanChuyen{

    double mucPhi = 29000;

    @Override
    public double phiVanChuyen() {
        return mucPhi;
    }

    @Override
    public int thoiGianVanChuyen() {
        return 0;
    }
}
