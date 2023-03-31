package behavioral.observer.A4_Topic;

import java.util.ArrayList;
import java.util.List;

class Topic {
    private List<Observer> observers;
    private List<String> messages;

    public Topic() {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void createMessage(String message) {
        messages.add(message);
        notifyObservers();
    }

    public void updateMessage(int index, String message) {
        messages.set(index, message);
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(messages);
        }
    }

    public static interface Observer {
        void update(List<String> messages);
    }

}

