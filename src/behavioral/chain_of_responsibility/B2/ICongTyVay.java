package behavioral.chain_of_responsibility.B2;

public interface ICongTyVay {
    String xuLyKhoanVay(int tienVay);
    ICongTyVay capCaoHon(ICongTyVay iCongTyVay); // cấp cao hơn có khả năng cho xử lý vay
}
