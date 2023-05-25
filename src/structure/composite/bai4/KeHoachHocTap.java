package structure.composite.bai4;

public interface KeHoachHocTap {

    int getSoTC();

    int getHP();
    String getMonHocs();

    void add(KeHoachHocTap keHoachHocTap);

    void remove(KeHoachHocTap keHoachHocTap);

}
