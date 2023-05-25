package behavioral.template_method.d3;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "name:" + name + ' ' +
                ", price:" + price + ' ' +
                ", quantity:" + quantity + '\n';
    }
}
