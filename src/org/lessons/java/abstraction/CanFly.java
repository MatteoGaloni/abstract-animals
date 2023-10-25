package org.lessons.java.abstraction;

public interface CanFly {
    void fly();

    default void mySwim(){
        System.out.println("I am swimming(default)");
    }
}
