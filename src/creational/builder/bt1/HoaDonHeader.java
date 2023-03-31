package creational.builder.bt1;

public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nMã hóa đơn: ").append(maHoaDon)
                .append("\nNgày bán: ").append(ngayBan)
                .append("\nTên khách hàng: ").append(tenKhachHang);
        return s.toString();
    }

}
