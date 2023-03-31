package behavioral.observer.A4_Topic;

import java.util.List;

class MemberA implements Topic.Observer {

    Topic topic;
    public MemberA(Topic t) {
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
    public void update(List<String> message) {
        System.out.println("Member A received: " + message.get(message.size()-1));
    }
}

