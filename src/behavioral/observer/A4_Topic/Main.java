package behavioral.observer.A4_Topic;

public class Main {
    public static void main(String[] args) {

        Topic t = new Topic();

        ThanhVienA a = new ThanhVienA(t);
        ThanhVienB b = new ThanhVienB(t);

        a.dangKy();
        b.dangKy();

        t.taoMoi(new TinTuc("Hello", 1));
        t.taoMoi(new TinTuc("Hello 2", 2));
        t.taoMoi(new TinTuc("Hello 3", 3));

        t.capNhat(new TinTuc("Hello 4", 2));
    }
}
