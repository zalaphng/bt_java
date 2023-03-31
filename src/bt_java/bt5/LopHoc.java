package bt_java.bt5;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {

    String giaoVienCN;
    String qldsGVGD;
    String qldsHS;
    List<GiaoVien> giaoVienGD = new ArrayList<>();
    List<HocSinh> hocSinh = new ArrayList<>();

    public LopHoc(){

    }
    public LopHoc(String giaoVienCN, String qldsGVGD, String qldsHS) {
        this.giaoVienCN = giaoVienCN;
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
    }

    public int themHocSinh(HocSinh hs) {
        hocSinh.add(hs);
        return 0;
    }

    public int themGVGD(GiaoVien gv) {
        giaoVienGD.add(gv);
        return 0;
    }

    public int inDSHS() {
//        for (HocSinh hs: hocSinh
//             ) {
//            hs.HienThiTT();
//        }

        for (HocSinh hs: hocSinh) {
           if (hocSinh.size() == 0) {
               System.out.printf("\nKhong co hoc sinh");
           } else {
               System.out.printf("\n==================");
               System.out.printf("\nHoc sinh "+ hocSinh.indexOf(hs)+1);
               System.out.printf(hs.HienThiTT());
           }
        }
        return 0;
    }

    public int inDSGVGD() {
        for (GiaoVien gv: giaoVienGD) {
            if (hocSinh.size() == 0) {
                System.out.printf("\nKhong co giao vien");
            } else {
                System.out.printf("\n==================");
                System.out.printf("\nGiao vien " + giaoVienGD.indexOf(gv) + 1);
                System.out.printf(gv.HienThiTT());
            }
        }
        return 0;
    }
}
