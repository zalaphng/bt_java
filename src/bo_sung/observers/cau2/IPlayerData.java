package bo_sung.observers.cau2;

public abstract class IPlayerData {

    IDashboard dashboard;
    abstract void setThoiGian(int thoiGian);
    abstract void setCountDown(int countDown);
    abstract void setGrade(int grade);

    abstract void thongBao(IPlayerData p);

    abstract String show();

    public static interface IDashboard {
        public void thongBao(IPlayerData p);
    }

    abstract void attach(IDashboard dashboard);

    abstract void detach();

}
