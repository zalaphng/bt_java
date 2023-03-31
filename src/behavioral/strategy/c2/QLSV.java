package behavioral.strategy.c2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList<>();

    ISoSanh<SinhVien> soSanh;

    public QLSV(List<SinhVien> svs) {
        this.svs = svs;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void sapXep(){
        svs.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }

    public void inDS(){
        svs.forEach((t) -> {
            int index = svs.indexOf(t)+1;
            System.out.println("Sinh Vien "+ index + ": " + t);
        });
    }
}
