package behavioral.observer.A2_Console;

public class MainA2 {
    public static void main(String[] args) {
        Button b = new Button();
        Activity a = new Activity(b);
        b.click();
        b.click();
        b.click();
        b.click();
    }
}

