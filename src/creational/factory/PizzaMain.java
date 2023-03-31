package creational.factory;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore store = new MamTomPizzaStore();
        Pizza p = store.orderPizza(PizzaType.MamTom);
        System.out.printf(p.toString());
    }
}
