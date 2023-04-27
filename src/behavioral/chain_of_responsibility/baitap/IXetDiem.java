package behavioral.chain_of_responsibility.baitap;

public interface IXetDiem {
    public String xetDiem(double diem);
    public IXetDiem bacTiepTheo(IXetDiem bacCaoHon);
}
