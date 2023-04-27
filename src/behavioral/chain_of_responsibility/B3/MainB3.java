package behavioral.chain_of_responsibility.B3;

public class MainB3 {
    public static void main(String[] args) {
        ITinhTienDien B1 = new TinhTienDien(0, 50, 1.678);
        ITinhTienDien B2 = new TinhTienDien(51, 100, 1.734);
        ITinhTienDien B3 = new TinhTienDien(101, 200, 2.014);
        ITinhTienDien B4 = new TinhTienDien(201, 300, 2.536);
        ITinhTienDien B5 = new TinhTienDien(301, 400, 2.834);
        ITinhTienDien B6 = new TinhTienDien(401, Integer.MAX_VALUE, 2.927);

        B1.bacTiep(B2).bacTiep(B3).bacTiep(B4).bacTiep(B5).bacTiep(B6);
        System.out.printf("Tong Tien Dien: " + Math.round(B1.tinhTien(42) * 100.0) / 100.0);
    }
}
