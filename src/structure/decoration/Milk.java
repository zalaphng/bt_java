package structure.decoration;

public class Milk extends CondimentDecorator{

    public Milk(String description, Beverage component) {
        super(description, component);
    }

    @Override
    public double cost() {
        return 0.20 + component.cost();
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " " + this.description;
    }
}
