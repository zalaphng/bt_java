package behavioral.template_method.d3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("A", 10000, 25));
        products.add(new Product("C", 30000, 25));
        products.add(new Product("D", 15000, 25));
        products.add(new Product("B", 22000, 25));
        products.add(new Product("E", 8000, 25));
        products.add(new Product("F", 140000, 25));
        products.add(new Product("H", 21000, 25));

        System.out.printf("Sort by name\n");
        SortProductByName sortByName = new SortProductByName();
        sortByName.sort(products);

        for (Product product : products) {
            System.out.printf("" + product.toString());
        }

        System.out.printf("\nSort by price\n");
        SortProductByPrice sortByPrice = new SortProductByPrice();
        sortByPrice.sort(products);

        for (Product product : products) {
            System.out.printf("" + product.toString());
        }
    }
}
