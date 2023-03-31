package behavioral.strategy.duck_62cntt;

public class MainDuck {
    public static void main(String[] args) {
        VitBau vb = new VitBau();
        vb.setFlyBehavior(new FlyWithWings());
        vb.setQuarkBehavior(new Squeak());
        vb.display();
        vb.setQuarkBehavior(new MuteQuack());
        vb.display();
    }
}
