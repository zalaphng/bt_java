package bo_sung.observers.cau2;

public class PlayerDataExtended extends PlayerDataDecorator{

    int bonus;

    int level;

    public PlayerDataExtended(IPlayerData playerData, int bonus, int level) {
        super(playerData);
        this.bonus = bonus;
        this.level = level;
    }

    public void thongBao(IPlayerData p) {
        if (dashboard != null)
        dashboard.thongBao(this);
    }

    @Override
    String show() {
        return playerData.show() + ", Bonus: " + bonus + ", Level: " + level;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
        thongBao(this);
    }

    public void setLevel(int level) {
        this.level = level;
        thongBao(this);
    }

    @Override
    public void setThoiGian(int thoiGian) {
        playerData.setThoiGian(thoiGian);
        thongBao(this);
    }

    @Override
    public void setCountDown(int countDown) {
        playerData.setCountDown(countDown);
        thongBao(this);
    }

    @Override
    public void setGrade(int grade) {
        playerData.setGrade(grade);
        thongBao(this);
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
