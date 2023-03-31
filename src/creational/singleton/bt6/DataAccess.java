package creational.singleton.bt6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    public static DataAccess instance;

    List<SanPham> listSP = new ArrayList<>();
    private DataAccess() {
    }

    public static DataAccess getInstance() {
        if (instance == null)
            instance = new DataAccess();
        return instance;
    }

    public void add(SanPham value) {
        listSP.add(value);
    }

    public void delete(int index) {
        listSP.remove(index);
    }

    public void update(int index, SanPham newValue) {
        for (SanPham item : listSP) {
            if (listSP.indexOf(item) == index) {
                listSP.set(index, newValue);
            }
        }
    }

    public void show(){
        for (SanPham sanPham : listSP) {
            System.out.printf(sanPham.toString());
        }
    }


}
