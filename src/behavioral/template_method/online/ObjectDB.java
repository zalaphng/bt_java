package behavioral.template_method.online;

import java.util.ArrayList;
import java.util.List;


public abstract class ObjectDB<T> {
    List<T> list = new ArrayList<>();
    public abstract int getId(T t);
    T findById(int id) {
        for (var t : list) {
            if (getId(t) == id) {
                return t;
            }
        }
        return null;
    }

    public void add(T t){
        for (var o : list) {
            if (getId(t) == getId(o)) {
                return;
            }
        }
        list.add(t);
    }

    public void update(T t){
        for (int i = 0; i < list.size(); i++) {
            if(getId(list.get(i)) == getId(t)){
                list.set(i, t);
                return;
            }
        }
    }

    public void deleteById(int id) {
        for (var o:
             list) {
            if(getId(o) == id) {
                list.remove(o);
                return;
            }
        }
    }
}
