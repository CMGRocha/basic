package com.basic.designpattern.behaviour.observer;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}
