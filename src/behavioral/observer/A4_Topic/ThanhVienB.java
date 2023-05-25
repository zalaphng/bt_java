package behavioral.observer.A4_Topic;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.INhanTin{

    Topic t;

    List<TinTuc> tinTucs = new ArrayList<>();

    public ThanhVienB(Topic t) {
        this.t = t;
    }

    public void dangKy() {
        t.attach(this);
    }

    public void huyDangKy() {
        t.detach(this);
    }

    @Override
    public void capNhat(TinTuc t) {
        System.out.printf("== B ==\n");
        int check = 0;
        for (int i = 0; i < tinTucs.size(); i++) {
            if (tinTucs.get(i).id == t.id ) {
                tinTucs.get(i).noiDung = t.noiDung;
                check = 1;
                break;
            }
        }
        if (check == 0)
        tinTucs.add(t);

        show();
    }

    public void show() {
        for (TinTuc t :
                tinTucs) {
            System.out.printf("" + t.toString());
        }
    }


}
