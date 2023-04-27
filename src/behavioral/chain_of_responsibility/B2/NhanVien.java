package behavioral.chain_of_responsibility.B2;

public class NhanVien implements ICongTyVay {
    ICongTyVay capCaoHon;
    String ten, chucVu;
    int hanMucChoVay;

    public NhanVien(String ten, String chucVu, int hanMucChoVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if (tienVay <= hanMucChoVay)
            return chucVu + " " + ten + " xử lý khoản vay";
        return capCaoHon.xuLyKhoanVay(tienVay);
                // chuyển yêu cầu cho cấp cao hơn xử lý
    }

    @Override
    public ICongTyVay capCaoHon(ICongTyVay capCaoHon) {
        this.capCaoHon = capCaoHon;
        return capCaoHon;
    }
}
