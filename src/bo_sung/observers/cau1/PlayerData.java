package bo_sung.observers.cau1;

public class PlayerData {

    IDashboard dashboard;
    int thoiGian;
    int countDown;

    int grade;

    public void attach(IDashboard dashboard) {
        this.dashboard = dashboard;
    }

    public void detach() {
        this.dashboard = null;
    }

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

    public void thongBao(PlayerData p){
        dashboard.thongBao(this);
    }

    public static interface IDashboard {
        public void thongBao(PlayerData p);
    }

}
