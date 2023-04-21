package creational.factory.bt3;

public class Triangle extends Shape {

    private static Triangle triangleShape;

    protected Triangle() {}
    public static Triangle createShape() {
        if (triangleShape == null)
            triangleShape = new Triangle();
        return triangleShape;
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
