package structure.composite.bai4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung implements KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();


    @Override
    public int getSoTC() {
        int s = 0;
        for (KeHoachHocTap k : list) {
            s += k.getSoTC();
        };
        return s;
    }

    @Override
    public int getHP() {
        int s = 0;
        for (KeHoachHocTap k : list) {
            s += k.getHP();
        };
        return s;
    }

    @Override
    public String getMonHocs() {
        StringBuilder s = new StringBuilder();
        for (KeHoachHocTap k : list) {
            s.append(k.getMonHocs() + "\n");
        };
        return s.toString();
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {
        list.add(keHoachHocTap);
    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {
        list.remove(keHoachHocTap);
    }
}
