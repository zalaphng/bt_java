package creational.factory;

public class MamTomPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.MamNem)
            return new PizzaMamNem();
        if (type == PizzaType.MamTom)
            return new MamTomPizza();
        return null;
    }

    @Override
    public Pizza orderPizza(PizzaType type) {
        return super.orderPizza(type);
    }
}
