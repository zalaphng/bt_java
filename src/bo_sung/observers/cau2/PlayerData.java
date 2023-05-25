package bo_sung.observers.cau2;

public class PlayerData extends IPlayerData {

    int thoiGian;
    int countDown;

    int grade;

    public PlayerData(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        thongBao(this);
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        thongBao(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        thongBao(this);
    }

    @Override
    void thongBao(IPlayerData p) {
        if (dashboard != null)
            dashboard.thongBao(this);
    }

    @Override
    String show() {
        return "Thoigian: " + thoiGian + ", countDown: " + countDown + ", grade: " + grade;
    }

    @Override
    void attach(IDashboard dashboard) {
        this.dashboard = dashboard;
    }

    @Override
    void detach() {
        this.dashboard = null;
    }
}
