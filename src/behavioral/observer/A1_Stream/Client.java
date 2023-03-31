package behavioral.observer.A1_Stream;

public class Client<T> implements Stream.StreamListener<T>{
    Stream<T> s;

    public Client(Stream<T> s) {
        this.s = s;
        s.listen(this);
    }

    @Override
    public void handle(T t) {

    }
}
