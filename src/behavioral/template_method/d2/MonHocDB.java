package behavioral.template_method.d2;

public class MonHocDB extends EntityDB<MonHoc>{
    @Override
    public int getKey(MonHoc monHoc) {
        return monHoc.getMaMH();
    }
}
