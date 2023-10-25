package org.lessons.java.abstraction;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void roar() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println("Squid");
    }
}
