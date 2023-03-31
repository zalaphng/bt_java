package behavioral.strategy.duck_62cntt;

public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quarkBehavior;
    public abstract void display();
    public void performQuark(){
        System.out.println(quarkBehavior.quack());
    }

    public void performFly(){
        System.out.println(flyBehavior.fly());
    }
}
