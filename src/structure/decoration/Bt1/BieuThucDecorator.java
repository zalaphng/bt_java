package structure.decoration.Bt1;

public abstract class BieuThucDecorator extends BieuThuc{

    BieuThuc bt;

    public BieuThucDecorator(BieuThuc bt) {
        this.bt = bt;
    }


    public abstract float giaTri();


    public abstract String bieuThuc();
}
