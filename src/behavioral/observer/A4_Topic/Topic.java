package behavioral.observer.A4_Topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<INhanTin> observers = new ArrayList<>();

    List<TinTuc> tinTucs = new ArrayList<>();

    public void attach(INhanTin nhanTin){
        if (!observers.contains(nhanTin)){
            observers.add(nhanTin);
        }
    }

    public void detach(INhanTin nhanTin){
        if (observers.contains(nhanTin)){
            observers.remove(nhanTin);
        }
    }

//    không cho đứa khác gọi
    private void notifyTin(TinTuc t){
        for (INhanTin nhanTin:
                observers) {
            nhanTin.capNhat(t);
        }
    }

    public void taoMoi(TinTuc t){
        tinTucs.add(t);
        notifyTin(t);
    }

    public void capNhat(TinTuc t){
        for (TinTuc old : tinTucs) {
            if (old.id == t.id){
                old.noiDung = t.noiDung;
                notifyTin(t);
                break;
            }
        }
    }

    public static interface INhanTin {
        public void capNhat(TinTuc t);
    }
}
