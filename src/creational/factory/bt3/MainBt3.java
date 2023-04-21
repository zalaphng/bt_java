package creational.factory.bt3;

public class MainBt3 {
    public static void main(String[] args) {
        Shape s = ShapeFactory.createShape(ShapeType.Circle);

        System.out.printf("Draw: " + s.draw());

        Shape s2 = ShapeFactory.createShape(ShapeType.Triangle);
        System.out.printf("\nDraw: "+ s2.draw());

        Shape s3 = ShapeFactory.createShape(ShapeType.Rectangle);
        System.out.printf("\nDraw: "+ s3.draw());
    }
}
