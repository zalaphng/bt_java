package creational.builder.bt1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {

    private HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();

    public HoaDon(Builder b) {
        this.header = b.header;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Hóa đơn: ")
                .append(header.toString());
        for (CTHD c: cthds ) {
            s.append(c.toString());
        }
        return s.toString();
    }

    public static class Builder {
        private HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();

        public Builder setHeader(String soHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(soHD, ngayBan, tenKH);
            return this;
        }

        public Builder addCTHD(String sanPham, double donGia, double chietKhau, int soLuong){
            CTHD cthd = new CTHD(sanPham, donGia, chietKhau, soLuong);
            cthds.add(cthd);
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }

    }

}
