package behavioral.template_method.d3;

public class SortProductByPrice extends SortCollection<Product>{
    @Override
    protected int compare(Product t1, Product t2) {
        if (t1.price > t2.price) {
            return 1;
        }
        else return t1.price == t2.price ? 0 : -1;
    }
}
