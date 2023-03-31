package creational.builder.bt1;

public class CTHD {
    String sanPham;
    double donGia, chietKhau;
    int soLuong;

    public CTHD(String sanPham, double donGia, double chietKhau, int soLuong) {
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n======================================")
                .append("\nSản phẩm: ").append(sanPham)
                .append("\nĐơn giá: ").append(donGia)
                .append("\nChiết khấu: ").append(chietKhau)
                .append("\nSố lượng: ").append(soLuong);
        return s.toString();
    }


}
