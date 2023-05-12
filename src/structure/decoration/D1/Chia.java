package structure.decoration.D1;

public class Chia extends BieuThucDecorator{

    float toanHang;

    public Chia(BieuThuc bt, float toanHang) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bt.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bt.bieuThuc() + ")" + " / " + toanHang;
    }
}
