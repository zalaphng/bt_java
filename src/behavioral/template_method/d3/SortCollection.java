package behavioral.template_method.d3;

import java.util.List;

public abstract class SortCollection<T> {
    protected abstract int compare(T t1, T t2);

    public void sort(List<T> list){
        list.sort((o1, o2) -> compare(o1,o2));
    }
}
