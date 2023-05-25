package behavioral.template_method.d2;

public class MonHoc {
    int maMH;
    String tenMH, soTC;

    public MonHoc(int maMH, String tenMH, String soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getMaMH() {
        return maMH;
    }

    @Override
    public String toString() {
        return
                "maSV: " + maMH + ' ' +
                ", tenSV: " + tenMH + ' ' +
                ", ngaySinh: " + soTC + '\n';
    }
}
