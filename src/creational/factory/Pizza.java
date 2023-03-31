package creational.factory;

// để default tương đương với protected
public abstract class Pizza {
    StringBuilder builder = new StringBuilder();

    // có thể để public, để store gọi
    abstract void prepare();

    abstract void bake();

    abstract void cut();

    abstract void box();

    // để bên ngoài gọi
    @Override
    public String toString() {
        return builder.toString();
    }
}