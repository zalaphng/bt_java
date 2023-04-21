package behavioral.chain_of_responsibility.f88;

public class NhanVienF88 implements IXuLyVay{
    IXuLyVay capCaoHon;
    String ten, chucVu;
    int hanMucChoVay;

    public NhanVienF88(String ten, String chucVu, int hanMucChoVay) {
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
    public IXuLyVay capCaoHon(IXuLyVay capCaoHon) {
        this.capCaoHon = capCaoHon;
        return capCaoHon;
    }
}
