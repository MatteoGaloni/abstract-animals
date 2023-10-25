package org.lessons.java.abstraction;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void roar() {
        System.out.println("Scream");
    }

    @Override
    public void eat() {
        System.out.println("Little birds");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
