package creational.builder.bt1;

public class MainBT1 {
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.Builder()
                .setHeader("1", "09/02/2023","What")
                    .addCTHD("Potato", 23000, 1.3, 3)
                        .addCTHD("Tomato", 14000, 2.7, 8)
                                .build();

        System.out.printf(hd1.toString());
    }
}
