package bt_java.bt5;

public class bt5Main {
    public static void main(String[] args) {
        LopHoc lopHoc1 = new LopHoc();
        HocSinh hs = new HocSinh("A", "A", "123", 18, "A1", "Khong co");
        GiaoVien gv = new GiaoVien("A", "A", "456", 18, "English", "Ngoai Ngu");

        lopHoc1.themHocSinh(hs);
        lopHoc1.themGVGD(gv);
        lopHoc1.inDSHS();
        lopHoc1.inDSGVGD();
    }
}
