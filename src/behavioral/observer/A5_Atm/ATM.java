package behavioral.observer.A5_Atm;

public class ATM {

    // Một thẻ => không có danh sách, báo cho thẻ đó thôi
    private I_TaiKhoan observer;

    public void attach(I_TaiKhoan observer) {
        this.observer = observer;
    }

    public void detach(I_TaiKhoan observer) {
        if (this.observer != null)
            this.observer = null;
    }

    private boolean kiemTraTienRut(int soTienRut){
        return observer.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTien){
        if (observer != null){
            observer.nhanThongBao(soTien, true);
        } else {
            System.out.printf("Không có thẻ trong máy");
        }
    }

    public static interface I_TaiKhoan {

        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soTienDaRut, boolean thanhCong);

    }
}
