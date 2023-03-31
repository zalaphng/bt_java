package behavioral.strategy.c2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return  o1.hoten.compareTo(o2.hoten);
    }
}
