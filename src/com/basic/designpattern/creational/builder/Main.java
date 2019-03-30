package com.basic.designpattern.creational.builder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setAge(5)
                .setFirstName("Bob")
                .setHeight(6)
                .setAge(19)
                .build();
        System.out.println(person.toString());
    }
}
