package behavioral.chain_of_responsibility.B1;

public interface IRutTienATM {
    double rutTien(int soTien);

    IRutTienATM menhGiaThapHon(IRutTienATM iXyLyChoMuon);
}
