package behavioral.template_method.d2;

import behavioral.strategy.c2.SinhVien;

import java.util.ArrayList;
import java.util.List;


public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();
    public abstract int getKey(T t);
    T findById(int id) {
        for (var t : list) {
            if (getKey(t) == id) {
                return t;
            }
        }
        return null;
    }

    public void add(T t){
        for (var o : list) {
            if (getKey(t) == getKey(o)) {
                return;
            }
        }
        list.add(t);
    }

    public void update(T t){
        for (int i = 0; i < list.size(); i++) {
            if(getKey(list.get(i)) == getKey(t)){
                list.set(i, t);
                return;
            }
        }
    }

    public void deleteById(int id) {
        for (var o:
                list) {
            if(getKey(o) == id) {
                list.remove(o);
                return;
            }
        }
    }

    public void delete(T t){
        for (var o : list) {
            if (getKey(t) == getKey(o)) {
                list.remove(t);
            }
        }
    }

    public void show(){
        for (T t:
             list) {
            System.out.printf("" + t.toString());
        }
    }
}
