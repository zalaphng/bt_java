package behavioral.strategy.c3;

public class Airpay implements IThanhToan{

    @Override
    public double thanhToanGioHang(double tongTien) {
        return tongTien * 0.03;
    }
}
