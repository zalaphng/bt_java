package behavioral.chain_of_responsibility.f88;

public class GiamDocF88 implements IXuLyVay{
    String ten;
    int hanMucChoVay;

    public GiamDocF88(String ten, int hanMucChoVay) {
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
    public IXuLyVay capCaoHon(IXuLyVay iXuLyVay) {
        return null;
    }
}
