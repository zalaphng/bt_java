package bt_java.bt5;

import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{

    List<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        for (CaNhan cn:
             dsCaNhan) {
            if (cn.hoTen == ten)
                dsCaNhan.remove(cn);
        }
        return 0;
    }

    @Override
    public void inDS() {
        for (CaNhan cn: dsCaNhan){
            cn.HienThiTT();
        }
    }
}
