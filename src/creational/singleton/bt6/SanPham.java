package creational.singleton.bt6;

public class SanPham {
    String maSanPham, tenSanPham;
    int soLuong;
    double donGia;

    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham \n" +
                "+ Mã Sản Phẩm: " + maSanPham + '\n' +
                "+ Tên Sản Phẩm: " + tenSanPham + '\n' +
                "+ Số lượng: " + soLuong + '\n' +
                "+ Đơn giá: " + donGia + '\n';
    }
}
