package behavioral.strategy.c3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {

    IThanhToan PTThanhToan;
    IVanChuyen vanChuyen;
    IKhuyenMai khuyenMai;
    List<MatHang> gioHang = new ArrayList<>();

    public IThanhToan getPTThanhToan() {
        return PTThanhToan;
    }

    public void setPTThanhToan(IThanhToan PTThanhToan) {
        this.PTThanhToan = PTThanhToan;
    }

    public IVanChuyen getVanChuyen() {
        return vanChuyen;
    }

    public void setVanChuyen(IVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public IKhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void themMatHang(MatHang mh)
    {
        gioHang.add(mh);
    }

    double tongTien() {
        double sum = 0;
        for (MatHang mh :
                gioHang) {
            sum+=mh.donGia*mh.soLuong;
        }
        return sum;
    }

    double giamThanhToan() {
        return PTThanhToan.thanhToanGioHang(tongTien());
    }

    double phiVanChuyen() {
        return vanChuyen.phiVanChuyen();
    }

    double soNgayGiao() {
        return vanChuyen.thoiGianVanChuyen();
    }
    double tienKhuyenMai() {
        return khuyenMai.soTienKM(tongTien());
    }

    public void thanhToan() {
        double tongTien = this.tongTien();
        double tienThanhToan = tongTien + phiVanChuyen() - (giamThanhToan() + tienKhuyenMai());

        System.out.println("Tổng tiền: "+ tongTien());
        System.out.println("Tiền được giảm: " + giamThanhToan());
        System.out.println("Tiền được khuyến mãi: " + tienKhuyenMai());
        System.out.println("Phí vận chuyển: " + phiVanChuyen());
        System.out.println("============================");
        System.out.println("Tiền cần thanh toán: " + tienThanhToan);
        System.out.println("Thời gian dự kiếm sẽ nhận hàng: " + soNgayGiao() + " ngày");
    }
}
