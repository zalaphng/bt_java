package behavioral.strategy.c3;

public class NinjaVan implements IVanChuyen{

    double mucPhi = 25000;

    @Override
    public double phiVanChuyen() {
        return mucPhi;
    }

    @Override
    public int thoiGianVanChuyen() {
        return 5;
    }
}
