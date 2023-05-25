package behavioral.observer.A4_Topic;

public class ThanhVienA implements Topic.INhanTin {

    Topic t;

    public ThanhVienA(Topic t) {
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
        System.out.printf("== A ==\n");
        System.out.printf("" + t.noiDung + '\n');
    }
}
