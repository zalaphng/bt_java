package bo_sung.observers.cau2;

public class Dashboard implements IPlayerData.IDashboard{

    IPlayerData playerData;


    public Dashboard(IPlayerData playerData) {
        this.playerData = playerData;
    }

    public void register(){
        playerData.attach(this);
    }

    public void unregister(){
        playerData.detach();
    }

    @Override
    public void thongBao(IPlayerData p) {
        this.playerData = p;
        show();
    }

    public void show(){
        System.out.printf(
                "Dashboard:" + playerData.show() + "\n"
        );
    }
}
