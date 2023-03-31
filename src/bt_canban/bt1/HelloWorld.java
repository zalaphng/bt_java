package bt_canban.bt1;

public class HelloWorld {

    private static int a = 5;
    int c;

    public static int getA() {
        return a;
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.say();
        System.out.println(getA());
    }
}
