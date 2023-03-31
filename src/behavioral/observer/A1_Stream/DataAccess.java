package behavioral.observer.A1_Stream;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<Course> list = new ArrayList<>();
    Stream<List<Course>> stream;

    public DataAccess(Stream<List<Course>> stream) {
        this.stream = stream;
    }

    public void add(Course c){
        list.add(c);
        stream.addEvent(list);
    }

    public void update(int index, Course c){
        list.set(index, c);
        stream.addEvent(list);
    }

    public void delete(int index){
        list.remove(index);
        stream.addEvent(list);
    }

}
