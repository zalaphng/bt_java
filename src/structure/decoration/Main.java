package structure.decoration;

public class Main {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cà phé HouseBlend");
        System.out.printf(b.getDescription() + " $" + b.cost() + "\n");

        Beverage cafeSua = new Milk("Sữa", b);
        System.out.printf(cafeSua.getDescription() + " $" + cafeSua.cost() + "\n");
    }
}
