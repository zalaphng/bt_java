package bo_sung.observers.cau2;

public class Main {
    public static void main(String[] args) {
        PlayerData p = new PlayerData(100, 2, 3);

        PlayerDataExtended p2 = new PlayerDataExtended(p, 100, 2);
        Dashboard d2 = new Dashboard(p2);
        d2.register();

        p2.setThoiGian(200);
        p2.setBonus(200);
        p2.setLevel(100);
        p2.setGrade(500);
    }
}
