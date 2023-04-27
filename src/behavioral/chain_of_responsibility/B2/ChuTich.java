package behavioral.chain_of_responsibility.B2;

public class ChuTich implements ICongTyVay {
    String ten;
    int hanMucChoVay;

    public ChuTich(String ten, int hanMucChoVay) {
        this.ten = ten;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucChoVay)
            return "Giam doc " + ten + " xử lý khoản vay";
        return "Ra ngân hàng vay";
    }

    @Override
    public ICongTyVay capCaoHon(ICongTyVay iCongTyVay) {
        return null;
    }
}
