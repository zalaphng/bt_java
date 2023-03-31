package behavioral.observer.A1_Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> { // Generic
    List<StreamListener> listeners = new ArrayList<>();

    public void listen(StreamListener listener){
        listeners.add(listener);
    }

    public void addEvent(T t){ //giống notify //Đang cần t cho nó t
        for(StreamListener listener : listeners){
            listener.handle(t);
        }
    }

    public static interface StreamListener<T> {
        void handle(T t);
    }
}
