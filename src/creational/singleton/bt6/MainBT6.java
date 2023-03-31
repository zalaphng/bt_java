package creational.singleton.bt6;

public class MainBT6 {

    public static void main(String[] args) {

        DataAccess db = DataAccess.getInstance();

        db.add( new SanPham("111", "Potato", 5, 5));
        db.add( new SanPham("112", "Wheat", 5, 5));
        db.delete( 0);
        db.update( 0, new SanPham("111", "Tomato", 5, 5));

        db.show();
    }


}
