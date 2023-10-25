package org.lessons.java.abstraction;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void roar() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog kibble");
    }
}
