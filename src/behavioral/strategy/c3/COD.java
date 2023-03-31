package behavioral.strategy.c3;

public class COD implements IThanhToan{

    @Override
    public double thanhToanGioHang(double tongTien) {
        return tongTien * 0.02;
    }
}
