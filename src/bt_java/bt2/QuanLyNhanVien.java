package bt_java.bt2;

import bt_java.bt1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {

    List<NhanVien> listNV;
    QuanLyNhanVien () {
        listNV = new ArrayList<>();
    }
    @Override
    public void them(NhanVien nv) {
        listNV.add(nv);
    }

    @Override
    public void inDS() {
        listNV.forEach(nv -> System.out.printf(nv.toString()));
    }
}
