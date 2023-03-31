package behavioral.observer.A2_Console;

public class Activity implements Button.IActivity {
    private Button button;

    public Activity(Button button) {
        this.button = button;
        button.registerObserver(this);
    }

    @Override
    public void onClick(int clickCount) {
        System.out.println("Bạn click lần thứ " + clickCount);
    }
}

