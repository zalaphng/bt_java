package structure.composite.bai4;

public class MonHoc implements KeHoachHocTap{

    int soTC, hP;
    String monHocs;

    public MonHoc(int soTC, int hP, String monHocs) {
        this.soTC = soTC;
        this.hP = hP;
        this.monHocs = monHocs;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHP() {
        return hP;
    }

    @Override
    public String getMonHocs() {
        return monHocs;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {

    }

    @Override
    public void remove(KeHoachHocTap keHoachHocTap) {

    }
}
