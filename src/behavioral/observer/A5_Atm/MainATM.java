package behavioral.observer.A5_Atm;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan myAccount = new TaiKhoan(atm, "test", 200000);
        myAccount.duaTheVaoATM();
        atm.rutTien(100000);

    }
}
