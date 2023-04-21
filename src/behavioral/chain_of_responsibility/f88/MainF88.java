package behavioral.chain_of_responsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyVay gacCong = new NhanVienF88("Minh", "Gác cổng", 1500000);
        IXuLyVay gacThangMay = new NhanVienF88("Duy", "Gác thang máy", 25000000);
        IXuLyVay truongPhong = new NhanVienF88("Ly", "Trưởng phòng", 50000000);
        IXuLyVay phoGiamDoc = new NhanVienF88("Duy", "Phó giám đốc", 80000000);
        IXuLyVay giamDoc = new GiamDocF88("Phương", 100000000);
        gacCong.capCaoHon(gacThangMay)
                .capCaoHon(truongPhong)
                .capCaoHon(phoGiamDoc)
                .capCaoHon(giamDoc);
        System.out.printf(gacCong.xuLyKhoanVay(30000000));
    }
}
