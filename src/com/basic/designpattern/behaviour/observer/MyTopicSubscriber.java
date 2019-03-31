package com.basic.designpattern.behaviour.observer;

public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(getName() + ":: No new Message.");
        } else {
            System.out.println(getName() + ":: Consuming message:: " + msg);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        setTopic(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getTopic() {
        return topic;
    }

    public void setTopic(Subject topic) {
        this.topic = topic;
    }
}
