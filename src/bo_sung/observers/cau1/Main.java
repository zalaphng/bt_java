package bo_sung.observers.cau1;

public class Main {
    public static void main(String[] args) {
        PlayerData p = new PlayerData(100, 2, 3);
        Dashboard d = new Dashboard(p);
        d.register();

        p.setGrade(4);
        p.setThoiGian(50);
    }
}
