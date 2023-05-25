package bo_sung.chain_of_res;

public class Main {
    public static void main(String[] args) {

        IDoVeSo giaidd = new GiaiThuong("Độc đắc", new String[]{"960756"});
        IDoVeSo giai1 = new GiaiThuong("Nhất", new String[]{"62399"});
        IDoVeSo giai2 = new GiaiThuong("Nhì", new String[]{"81874","44529"});
        IDoVeSo giai3 = new GiaiThuong("Ba", new String[]{"64425","60619","32023"});
        IDoVeSo giaikk = new GiaiThapNhat("Khuyến Khích", "989");

        giaidd.giaiThapHon(giai1).giaiThapHon(giai2).giaiThapHon(giai3).giaiThapHon(giaikk);
        System.out.printf(giaidd.doVeSo("160619"));;
    }
}
