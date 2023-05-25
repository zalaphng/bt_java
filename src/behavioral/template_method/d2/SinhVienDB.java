package behavioral.template_method.d2;

public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    public int getKey(SinhVien sinhVien) {
        return sinhVien.getMSSV();
    }
}
