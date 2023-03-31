package bt_java.bt1;

public class NhanVien {
    String ten;
    String tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    public static void getTaen() {
        System.out.printf("What");
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }

    @Override
    public String toString() {
        return
                "\n ten: " + ten +
                "\n tuoi: " + tuoi +
                "\n diaChi: " + diaChi +
                "\n tienLuong: " + tienLuong +
                "\n tongGioLam: " + tongGioLam
                ;
    }

    public double tinhThuong() {
        if(getTongGioLam() >= 200) {
            return getTienLuong() * 20 / 100;
        } else if (getTongGioLam() >= 100) {
            return getTienLuong() * 10 / 100;
        } else {
            return 0;
        }
    }
}
