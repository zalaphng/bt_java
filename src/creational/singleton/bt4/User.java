package creational.singleton.bt4;

public class User {

    String name;
    boolean vote = false;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c) {
        Electron e = Electron.getInstance();
        if (!vote){
            e.vote(c);
            vote = true;
        }
    }
}
