package behavioral.template_method.d3;

public class SortProductByName extends SortCollection<Product>{
    @Override
    protected int compare(Product t1, Product t2) {
        return t1.name.compareTo(t2.name);
    }
}
