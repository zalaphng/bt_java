package bt_java.bt3.cntt2;

import bt_canban.bt1.SinhVien;

public abstract class SinhVienNTU {
    String hoTen, nganh;

    SinhVienNTU (String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public String getHocLuc() {
        if (getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() < 6.5) {
            return "Trung Bình";
        } else if (getDiem() < 7.5) {
            return "Khá";
        } else if (getDiem() < 9){
            return "Giỏi";
        } else {
            return "Xuất Sắc";
        }
    }

    public void xuat() {
        System.out.printf("\nHoten: " + hoTen);
        System.out.printf("\nNganh: " + nganh);
        System.out.printf("\nDiem: "+ getDiem());
        System.out.printf("\nHocLuc: "+ getHocLuc());
    }
}
