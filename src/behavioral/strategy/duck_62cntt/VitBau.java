package behavioral.strategy.duck_62cntt;

public class VitBau extends Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuarkBehavior() {
        return quackBehavior;
    }

    public void setQuarkBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println(quackBehavior.quack());
    }
}
