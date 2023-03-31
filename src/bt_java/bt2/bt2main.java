package bt_java.bt2;

import bt_java.bt1.NhanVien;

public class bt2main {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv = new NhanVien("AAA", "17", "C", 12000, 18);
        ql.them(nv);
        ql.inDS();
    }
}
