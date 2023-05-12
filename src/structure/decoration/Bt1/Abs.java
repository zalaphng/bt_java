package structure.decoration.Bt1;

public class Abs extends BieuThucDecorator{


    public Abs(BieuThuc bt) {
        super(bt);
    }

    @Override
    public float giaTri() {
        return Math.abs(bt.giaTri());
    }

    @Override
    public String bieuThuc() {
        return "|" + bt.bieuThuc() + "|";
    }
}
