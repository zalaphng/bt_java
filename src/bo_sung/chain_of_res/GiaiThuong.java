package bo_sung.chain_of_res;

public class GiaiThuong implements IDoVeSo {

    IDoVeSo giaiThapHon;

    String tenGiai;

    String[] boSoTT;

    public GiaiThuong(String tenGiai, String[] boSoTT) {
        this.tenGiai = tenGiai;
        this.boSoTT = boSoTT;
    }

    @Override
    public String doVeSo(String maVS) {
        for (String i : boSoTT) {
            if (maVS.endsWith(i)) {
                return "Bạn đã trúng giải " + tenGiai;
            }
        }
        return giaiThapHon.doVeSo(maVS);
    }

    @Override
    public IDoVeSo giaiThapHon(IDoVeSo iDoVeSo) {
        this.giaiThapHon = iDoVeSo;
        return giaiThapHon;
    }
}
