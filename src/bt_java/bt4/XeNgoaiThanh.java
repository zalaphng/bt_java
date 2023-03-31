package bt_java.bt4;

public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;

    public XeNgoaiThanh(String maSo, String taiXe, String soXe, int doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSo, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{}";
    }

}
