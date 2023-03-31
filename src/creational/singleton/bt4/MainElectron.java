package creational.singleton.bt4;

public class MainElectron {


    public static void main(String[] args) {
        User user1 = new User("A");
        user1.vote(Candidate.Donald_Trump);
        user1.vote(Candidate.Joe_Biden); // can't revote

        User user2 = new User("B");
        user2.vote(Candidate.Joe_Biden);

        User user3 = new User("C");
        user3.vote(Candidate.Donald_Trump);


        Electron el = Electron.getInstance();
        System.out.printf("Votes Of DonaldTrump: " + el.getVotes(Candidate.Donald_Trump));
        System.out.printf("\nVotes Of JoeBiden: " + el.getVotes(Candidate.Joe_Biden));
    }


}
