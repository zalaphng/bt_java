package behavioral.chain_of_responsibility.B3;

public class TinhTienDien implements ITinhTienDien{
    int min, max;
    double gia;

    ITinhTienDien bacTiep;

    public TinhTienDien(int min, int max, double gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public double tinhTien(int tongDien) {
        if (tongDien <= max)
            return (tongDien - min) * gia;
        else
            return (max - min) * gia + bacTiep.tinhTien(tongDien);
    }

    @Override
    public ITinhTienDien bacTiep(ITinhTienDien bacTiep) {
        this.bacTiep = bacTiep;
        return bacTiep;
    }
}
