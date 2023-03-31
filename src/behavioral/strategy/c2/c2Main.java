package behavioral.strategy.c2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class c2Main {
    public static void main(String[] args) throws ParseException {
        List<SinhVien> svl = new ArrayList<>();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");

        svl.add(new SinhVien("Nguyễn Văn C", DateFormat.parse("08/07/2019") , 6.5f));
        svl.add(new SinhVien("Nguyễn Văn B", DateFormat.parse("04/01/2018") , 9.5f));
        svl.add(new SinhVien("Nguyễn Văn A", DateFormat.parse("03/02/2017") , 4.5f));


        QLSV listSV = new QLSV(svl);
        listSV.inDS();

        System.out.println("\n===================\nSo sánh theo điểm");
        listSV.setSoSanh(new SoSanhTheoDiem());
        listSV.sapXep();
        listSV.inDS();

        System.out.println("\n===================\nSo sánh theo tên");
        listSV.setSoSanh(new SoSanhTheoTen());
        listSV.sapXep();
        listSV.inDS();
    }
}
