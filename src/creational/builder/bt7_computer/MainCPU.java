package creational.builder.bt7_computer;

public class MainCPU {
    public static void main(String[] args) {
        // Builder là lớp
        Computer c = new Computer.Builder()
                .buildCPU("Core i9 13567")
                .buildRAM("32 GB Kingston BUS 3600")
                .buildStorage("1TB SSD Samsung Evo 1280")
                .buildScreen("17 inces OLED")
                .build(); //trả về computer
        // thay về new bằng gì đó thì ta thay bằng Builder()
        // , khởi tạo thông qua Builder riêng
        // Bài tập 6 bài
        System.out.printf(c.toString());
    }
}
