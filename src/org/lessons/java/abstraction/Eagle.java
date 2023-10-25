package org.lessons.java.abstraction;

public class Eagle extends Animal{
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
}
