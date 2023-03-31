package bt_java.bt3.cntt2;

public class SinhVienBiz extends SinhVienNTU {

    double diemMarketing, diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSale)/3;
    }
}
