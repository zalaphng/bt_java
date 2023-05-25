package structure.composite.bai4;

public class Main {
    public static void main(String[] args) {
        MonHoc c = new MonHoc(3, 1000000, "Lập trình C");
        MonHoc p = new MonHoc(3, 2000000, "Lập trình Pascal");
        MonHoc a = new MonHoc(4, 500000, "Lập trình ???");

        KeHoachChung khc = new KeHoachChung();
        khc.add(c);
        khc.add(p);
        khc.add(a);

        System.out.printf(khc.getMonHocs());

        khc.remove(p);
        System.out.printf("\n ====== Xóa" + p.getMonHocs() + " ====== \n");
        System.out.printf(khc.getMonHocs());
        System.out.printf("\n" + khc.getSoTC());
    }
}
