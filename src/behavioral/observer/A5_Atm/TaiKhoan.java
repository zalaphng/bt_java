package behavioral.observer.A5_Atm;

public class TaiKhoan implements ATM.I_TaiKhoan{

    ATM atm;
    String tenTaiKhoan;
    double soDu;

    public TaiKhoan(ATM atm, String tenTaiKhoan, double soDu) {
        this.atm = atm;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }

    public void duaTheVaoATM(){
        atm.attach(this);
    }

    public void rutTheKhoiATM(){
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if (thanhCong) {
            if (soTienRut < soDu){
                System.out.printf("Tài khoản: " + tenTaiKhoan);
                System.out.printf("\nSố dư cũ: " + soDu);
                System.out.printf("\nTiền rút: " + soTienRut);
                System.out.printf("\nSố dư mới: " + (soDu - soTienRut));
            }
            else {
                System.out.printf("Không thể rút");
            }
        }
    }
}
