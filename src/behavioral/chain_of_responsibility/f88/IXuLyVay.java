package behavioral.chain_of_responsibility.f88;

public interface IXuLyVay {
    String xuLyKhoanVay(int tienVay);
    IXuLyVay capCaoHon(IXuLyVay iXuLyVay); // cấp cao hơn có khả năng cho xử lý vay
}
