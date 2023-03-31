package bt_java.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dscx = new ArrayList<>();

    public void them(ChuyenXe chuyenXe){
        for(ChuyenXe c:dscx) {
            if (c.maSo == chuyenXe.maSo) {
                return;
            }
        }
        dscx.add(chuyenXe);
    }

    public void xuatDS(){
        for (ChuyenXe c: dscx)
            System.out.printf(c.toString());
    }

    public int doanhThuXe(){
        int tong = 0;
        for (ChuyenXe c: dscx) {
            if (c instanceof ChuyenXe) {
                tong += c.doanhThu;
            }
        }
        return tong;
    }

    public int doanhThuXeNgoaiThanh(){
        int tong = 0;
        for (ChuyenXe c: dscx) {
            if (c instanceof XeNgoaiThanh) {
                tong += c.doanhThu;
            }
        }
        return tong;
    }

    public int doanhThuXeNoiThanh(){
        int tong = 0;
        for (ChuyenXe c: dscx) {
            if (c instanceof XeNoiThanh) {
                tong += c.doanhThu;
            }
        }
        return tong;
    }
}
