package structure.decoration;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
