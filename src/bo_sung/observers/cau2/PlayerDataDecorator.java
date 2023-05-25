package bo_sung.observers.cau2;

public abstract class PlayerDataDecorator extends IPlayerData {


    IPlayerData playerData;

    public PlayerDataDecorator(IPlayerData playerData) {
        this.playerData = playerData;
    }

    @Override
    public abstract void setThoiGian(int thoiGian);

    @Override
    public abstract void setCountDown(int countDown);

    @Override
    public abstract void setGrade(int grade);


}
