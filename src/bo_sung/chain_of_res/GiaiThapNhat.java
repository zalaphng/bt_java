package bo_sung.chain_of_res;

public class GiaiThapNhat implements IDoVeSo{

    String tenGiai;
    String soTT;

    public GiaiThapNhat(String tenGiai, String soTT) {
        this.soTT = soTT;
    }

    @Override
    public String doVeSo(String ms) {
        if(soTT.endsWith(ms))
            return "Trúng giải khuyến khích";
        else
            return "Chúc may mắn lần sau!";
    }

    @Override
    public IDoVeSo giaiThapHon(IDoVeSo iDoVeSo) {
        return null;
    }
}
