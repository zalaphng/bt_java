package creational.builder.bt5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int soTrang;
    List<String> danhSachChuong;

    private Book(Builder b) {
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.soTrang = b.soTrang;
        this.danhSachChuong = b.danhSachChuong;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Tựa đề: ").append(tuaDe)
                .append("\nTác giả: ").append(tacGia)
                .append("\nSố trang: ").append(soTrang)
                .append("\nDanh sách chương: ");

        for (String chuong :
                danhSachChuong) {
            s.append("\n").append(chuong);
        }

        return s.toString();
    }

    public static class Builder {
        private String tuaDe, tacGia;
        private int soTrang;
        private List<String> danhSachChuong;

        public Builder themTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }

        public Builder themTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder themSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public Builder themDanhSachChuong(List<String> danhSachChuong) {
            this.danhSachChuong = danhSachChuong;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }
}
