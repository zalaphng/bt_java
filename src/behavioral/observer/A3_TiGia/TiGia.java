package behavioral.observer.A3_TiGia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList();

    public void attach(I_TheoDoiTiGia o){
        if (!observers.contains(o))
            observers.add(o);
    }

    public void detach(I_TheoDoiTiGia o){
        if (observers.contains(o))
            observers.remove(o);
    }
    public void notifyTiGia(float delta){
        for (I_TheoDoiTiGia o: observers) {
            o.capNhatTiGia(delta);
        }
    }

     public static interface I_TheoDoiTiGia {
        void capNhatTiGia(float delta);
    }
}
