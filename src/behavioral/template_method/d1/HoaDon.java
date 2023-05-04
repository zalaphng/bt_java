package behavioral.template_method.d1;


import java.util.ArrayList;

public abstract class HoaDon {
    protected ArrayList<HangHoa> dsHangHoa;
    private int soLuong;
    public HoaDon(){
        dsHangHoa = new ArrayList<>();
    }

    public void setDsHangHoa(ArrayList<HangHoa> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }

    protected double tinhTien(){
        double t = 0;
        for(HangHoa h: dsHangHoa){
            t += (h.donGia * h.soLuong);
        }
        return  t;
    }
    protected abstract double tinhChietKhau(double tongTien);
    public double tienThanhToan(){
        return tinhTien()-tinhChietKhau(tinhTien());
    }
    public void hienThiGioHang(){
        double tongTien = tinhTien();
        double tienChietKhau = tinhChietKhau(tongTien);
        System.out.println("Tong tien" + tongTien);
        System.out.println("Chiet khau" + tienChietKhau);
        System.out.println("Thanh toan so tien" + tienThanhToan());
    }
}