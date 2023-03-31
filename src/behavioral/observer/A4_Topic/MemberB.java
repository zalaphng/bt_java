package behavioral.observer.A4_Topic;

import java.util.ArrayList;
import java.util.List;

class MemberB implements Topic.Observer {
    Topic topic;

    public MemberB(Topic t) {
        this.topic = t;
        t.registerObserver(this);
    }

    public void register(){
        topic.registerObserver(this);
    }

    public void cancelRegistration(){
        topic.removeObserver(this);
    }

    @Override
    public void update(List<String> messages) {
        printMessages(messages);
    }

    public void printMessages(List<String> messages) {
        System.out.println("Member B received:");
        for (int i = 0; i < messages.size(); i++) {
            System.out.println("Message " + i + ": " + messages.get(i));
        }
    }
}
