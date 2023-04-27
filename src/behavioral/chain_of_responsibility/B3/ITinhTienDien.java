package behavioral.chain_of_responsibility.B3;

public interface ITinhTienDien {
    double tinhTien(int tongDien);

    ITinhTienDien bacTiep(ITinhTienDien iTinhTienDien);
}
