package creational.singleton;

public class Singleton {
    private static Singleton instance;
    int count = 0;

    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void tang() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
