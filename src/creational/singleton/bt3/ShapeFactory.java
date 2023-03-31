package creational.singleton.bt3;

public class ShapeFactory {
    private static Shape instance;

    public static Shape createShape(ShapeType shapeType){
        if (instance == null) {
            switch (shapeType) {
                case Rectangle -> instance = new Rectangle();
                case Triangle -> instance = new Triangle();
                case Circle -> instance = new Circle();
            }
        }
        return instance;
    }
}
