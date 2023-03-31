package behavioral.strategy.c3;

public class c3Main {
    public static void main(String[] args) {
        MatHang mh1 = new MatHang("Mặt hàng 1", 2, 20000);
        MatHang mh2 = new MatHang("Mặt hàng 2", 2, 40000);

        GioHang gh = new GioHang();

        gh.themMatHang(mh1);
        gh.themMatHang(mh2);

        gh.setPTThanhToan(new Airpay());
        gh.setVanChuyen(new NinjaVan());
        gh.setKhuyenMai(new GiamToiDa());

        gh.thanhToan();
    }
}
