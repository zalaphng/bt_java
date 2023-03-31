package behavioral.strategy.c2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    String hoten;
    Date ngaySinh;
    float diemTB;

    SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien() {

    }

    public SinhVien(String hoten, Date ngaySinh, float diemTB) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "hoten='" + hoten + '\'' +
                ", ngaySinh=" + DateFormat.format(ngaySinh) +
                ", diemTB=" + diemTB ;
    }
}