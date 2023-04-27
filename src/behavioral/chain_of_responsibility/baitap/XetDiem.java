package behavioral.chain_of_responsibility.baitap;

public class XetDiem implements IXetDiem{
    String hocLuc;
    double min, max;

    IXetDiem bacCaoHon;

    public XetDiem(String hocLuc, double min, double max) {
        this.min = min;
        this.max = max;
        this.hocLuc = hocLuc;
    }

    @Override
    public String xetDiem(double diem) {
        if (diem >= 0 && diem <= 10){
            if (diem >= min && diem <= max)
                System.out.printf("Học lực: " + hocLuc + "\n");
            else bacCaoHon.xetDiem(diem);
        } else {
            System.out.printf("Số điểm không hợp lệ!");
        };
        return hocLuc;
    }

    @Override
    public IXetDiem bacTiepTheo(IXetDiem bacCaoHon) {
        this.bacCaoHon = bacCaoHon;
        return bacCaoHon;
    }
}
