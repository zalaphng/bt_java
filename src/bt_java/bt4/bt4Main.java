package bt_java.bt4;

public class bt4Main {

    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        XeNgoaiThanh xengt1 = new XeNgoaiThanh("A", "A", "A", 10000, "ASD", 17);
        XeNgoaiThanh xengt2 = new XeNgoaiThanh("B", "A", "A", 20000, "ASD", 17);
        XeNgoaiThanh xengt3 = new XeNgoaiThanh("C", "A", "A", 30000, "ASD", 17);

        XeNoiThanh xent1 = new XeNoiThanh("1", "A", "A", 10000, 17, 17);
        XeNoiThanh xent2 = new XeNoiThanh("2", "A", "A", 20000, 17, 17);
        XeNoiThanh xent3 = new XeNoiThanh("3", "A", "A", 30000, 17, 17);


        qlcx.them(xengt1);
        qlcx.them(xengt2);
        qlcx.them(xengt3);
        qlcx.them(xent1);
        qlcx.them(xent2);
        qlcx.them(xent3);

        System.out.printf("Doanh Thu: " + qlcx.doanhThuXe());
        System.out.printf("\nDoanh Thu Noi Thanh: " + qlcx.doanhThuXeNoiThanh());
        System.out.printf("\nDoanh Thu Ngoai Thanh: " + qlcx.doanhThuXeNgoaiThanh());
    }

}
