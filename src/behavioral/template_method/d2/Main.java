package behavioral.template_method.d2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SinhVienDB sinhVienDB = new SinhVienDB();

        sinhVienDB.add(new SinhVien(1,"Nguyen Van A","20-2-2002", "Khanh Hoa"));
        sinhVienDB.add(new SinhVien(2, "Nguyen Van B", "19-8-2002", "Khanh Hoa"));
        sinhVienDB.add(new SinhVien(3, "Nguyen Van C", "16-5-20002", "Khanh Hoa"));
        sinhVienDB.add(new SinhVien(4,"Nguyen Van D",  "1-1-2002", "Khanh Hoa"));

        sinhVienDB.deleteById(3);

        sinhVienDB.show();


    }
}
