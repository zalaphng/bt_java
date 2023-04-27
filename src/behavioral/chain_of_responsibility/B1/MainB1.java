package behavioral.chain_of_responsibility.B1;

public class MainB1 {
    public static void main(String[] args) {
        RutTienATMVND atmvnd = new RutTienATMVND();
        IRutTienATM atm = atmvnd.factory(50);
        atm.rutTien(293);
    }
}
