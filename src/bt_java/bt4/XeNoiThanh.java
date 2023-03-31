package bt_java.bt4;

public class XeNoiThanh extends ChuyenXe {
    int soTuyen, soKmDiDuoc;

    public XeNoiThanh(String maSo, String taiXe, String soXe, int doanhThu, int soTuyen, int soKmDiDuoc) {
        super(maSo, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{}";
    }
}
