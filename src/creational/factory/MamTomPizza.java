package creational.factory;

public class MamTomPizza extends Pizza {
    // sử dụng nội
    @Override
    void prepare() {
        builder.append("Mắm tôm và thịt cầy ướp riềng, sả\n");
    }

    @Override
    void bake() {
        builder.append("Nướng bánh\n");
    }

    @Override
    void cut() {
        builder.append("Cắt bánh\n");
    }

    @Override
    void box() {
        builder.append("Đóng hộp\n");
    }
}
