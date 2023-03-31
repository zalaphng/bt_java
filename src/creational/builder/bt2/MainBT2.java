package creational.builder.bt2;

public class MainBT2 {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder.Builder()
                .addString("Str")
                .addFloat(1.2f)
                .addBool(true)
                .build();

        System.out.printf(str.toString());
    }
}
