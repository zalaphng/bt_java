package behavioral.strategy.c1;

public class TinhToan extends context implements ITinh{
    ITinh tinhToan;

    public ITinh getTinhToan() {
        return tinhToan;
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    @Override
    public float tinh(float a, float b) {
        return tinhToan.tinh(a,b);
    }

}
