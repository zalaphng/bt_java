package behavioral.template_method.d1;

import java.util.ArrayList;
public class Main {
    public static void Main(String[] args) {
        ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

        dsHangHoa.add(new HangHoa("San pham 1",1,1000));
        dsHangHoa.add(new HangHoa("San Pham 2", 2, 200));
        dsHangHoa.add(new HangHoa("San Pham 3", 2, 500));
        dsHangHoa.add(new HangHoa("San Pham 4", 1, 100));

        HoaDon hd = new KimCuong();
        hd.setDsHangHoa(dsHangHoa);
        hd.hienThiGioHang();

    }
}