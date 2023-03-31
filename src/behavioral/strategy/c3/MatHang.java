package behavioral.strategy.c3;

public class MatHang {
    String tenMatHang;
    int soLuong, donGia;

    public MatHang() {
    }

    public MatHang(String tenMatHang, int soLuong, int donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
