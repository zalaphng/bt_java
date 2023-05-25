package behavioral.observer.A4_Topic;

public class TinTuc {
    String noiDung;
    int id;

    public TinTuc(String noiDung, int id) {
        this.noiDung = noiDung;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                noiDung + ' ' +
                ", id: " + id + '\n';
    }
}
