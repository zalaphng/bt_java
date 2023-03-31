package behavioral.observer.A2_Console;

public class Button {
    private int clickCount;
    private Activity activity;

    public Button() {
        this.clickCount = 0;
    }

    public void registerObserver(Activity observer) {
        this.activity = observer;
    }

    public void removeObserver(IActivity observer) {
        this.activity = null;
    }

    public void notifyObservers() {
        activity.onClick(clickCount);
    }

    public void click() {
        clickCount++;
        // notify
        notifyObservers();
    }

    public static interface IActivity {
        void onClick(int clickCount);
    }
}

