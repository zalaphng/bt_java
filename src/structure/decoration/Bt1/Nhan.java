package structure.decoration.Bt1;

public class Nhan extends BieuThucDecorator{

    float toanHang;

    public Nhan(BieuThuc bt, float toanHang) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bt.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bt.bieuThuc() + ")" + " * " + toanHang;
    }
}
