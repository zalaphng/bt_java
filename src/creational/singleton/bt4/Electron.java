package creational.singleton.bt4;

public class Electron {
    private static Electron electron;

    int donaldTrumpVotes = 0;
    int joeBidenVotes = 0;


    private Electron() {
    }

    public static Electron getInstance() {
        if (electron == null){
            electron = new Electron();
        }
        return electron;
    }

    public int getVotes(Candidate c) {
        return (c == Candidate.Donald_Trump) ? donaldTrumpVotes : joeBidenVotes;
    }

    public void vote(Candidate c){
        if (c == Candidate.Donald_Trump) {
            donaldTrumpVotes++;
        } else if (c == Candidate.Joe_Biden) {
            joeBidenVotes++;
        }
    }
}
