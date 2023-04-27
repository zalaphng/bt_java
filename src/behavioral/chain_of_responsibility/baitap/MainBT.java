package behavioral.chain_of_responsibility.baitap;

public class MainBT {
    public static void main(String[] args) {
        IXetDiem Gioi = new XetDiem("Giỏi", 8, 10);
        IXetDiem Kha = new XetDiem("Khá", 6.5, 7.9);
        IXetDiem TrungBinh = new XetDiem("Trung Bình", 5, 6.5);
        IXetDiem Yeu = new XetDiem("Yếu", 0, 4.9);

        Yeu.bacTiepTheo(TrungBinh).bacTiepTheo(Kha).bacTiepTheo(Gioi);
        Yeu.xetDiem(0);
        Yeu.xetDiem(2.5);
        Yeu.xetDiem(5);
        Yeu.xetDiem(7.5);
        Yeu.xetDiem(10);
        Yeu.xetDiem(1000000);
    }
}
