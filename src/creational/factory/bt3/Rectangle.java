package creational.factory.bt3;

public class Rectangle extends Shape{
    @Override
    public String draw() {
        return "Rectangle";
    }

   private static Shape retangleShape;

    protected Rectangle() {}

    public static Shape createShape() {
        if (retangleShape == null)
            retangleShape = new Rectangle();
        return retangleShape;
    }


}
