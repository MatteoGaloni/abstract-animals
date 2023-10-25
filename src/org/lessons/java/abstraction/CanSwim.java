package org.lessons.java.abstraction;

public interface CanSwim {
    void swim();
    default void mySwim(){
        System.out.println("I am swimming(default)");
    }
}
