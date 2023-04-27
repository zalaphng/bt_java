package behavioral.chain_of_responsibility.B2;

public class MainB2 {
    public static void main(String[] args) {
        ICongTyVay phoTruongPhong = new NhanVien("A", "Trưởng phòng", 50000000);
        ICongTyVay truongPhong = new NhanVien("B", "Trưởng phòng", 50000000);
        ICongTyVay giamDoc = new NhanVien("C", "Phó giám đốc", 80000000);
        ICongTyVay chuTich = new ChuTich("Chủ tịch", 100000000);
        phoTruongPhong
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc)
                .capCaoHon(chuTich);
        System.out.printf(phoTruongPhong.xuLyKhoanVay(300000000));
    }
}
