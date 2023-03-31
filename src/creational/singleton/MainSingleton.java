package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.tang();
        System.out.printf("s1: "+ s1.getCount()); // 1
        s2.tang();
        s1.tang();
        System.out.printf("s1: " + s1.getCount()); // 3
        System.out.printf("s2: " + s2.getCount()); // 3, một đối tượng duy nhất, cùng một biến íntace cùng sử dụng một vùng nhớ
    }
}
