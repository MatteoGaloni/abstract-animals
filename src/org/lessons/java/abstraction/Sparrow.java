package org.lessons.java.abstraction;

public class Sparrow extends Animal{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void roar() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println("Worms");
    }
}
