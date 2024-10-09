package org.example;

public class Bird {
    String name;
    void eat() {}
    void fly(){
        System.out.println("I'm flying");
    }

    public Bird(String name) {
        this.name = name;
    }
    public Bird(){}
}
