package bo_sung.observers.cau1;

public class Dashboard implements PlayerData.IDashboard{
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
    }

    public void register(){
        playerData.attach(this);
    }

    public void unregister(){
        playerData.detach();
    }

    @Override
    public void thongBao(PlayerData p) {
        this.playerData = p;
        show();
    }

    public void show(){
        System.out.printf(
                "Dashboard:"+ "\n" + "thoiGian: " + playerData.thoiGian +",\n countDown:" + playerData.countDown +",\n grade:" + playerData.grade + "\n"
        );
    }
}
