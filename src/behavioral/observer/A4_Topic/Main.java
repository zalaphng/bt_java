package behavioral.observer.A4_Topic;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();

        MemberA memberA = new MemberA(topic);
        MemberB memberB = new MemberB(topic);

        System.out.printf("\n====== Create Message ====== \n");
        topic.createMessage("Hello, World!");

        System.out.printf("\n====== Create 2nd Message ====== \n");
        topic.createMessage("Hello, World Again!");

        System.out.printf("\n====== Update Message ====== \n");
        topic.updateMessage(0, "Hello, Observer Pattern!");

        System.out.printf("\n====== Member B Out  ====== \n");
        memberB.cancelRegistration();

        System.out.printf("\n====== Create Message ====== \n");
        topic.createMessage("Goodbye!");

        System.out.printf("\n====== Member B Register Again  ====== \n");
        memberB.register();

        System.out.printf("\n====== Update Message ====== \n");
        topic.updateMessage(0, "Goodbye, Observer Pattern!");
    }
}
