package com.basic.designpattern.behaviour.observer;

public class Main {

    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer obj1 = new MyTopicSubscriber("Subscriber_1");
        Observer obj2 = new MyTopicSubscriber("Subscriber_2");
        Observer obj3 = new MyTopicSubscriber("Subscriber_3");

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //check if any update is available
        obj1.update();
        System.out.println();

        //now send message to subject
        topic.postMessage("Hello World");

        topic.unregister(obj1);
        topic.unregister(obj2);
        //topic.unregister(obj3);
        System.out.println();
        topic.postMessage("Bye World But No One is Listening, expect 3");

    }
}
