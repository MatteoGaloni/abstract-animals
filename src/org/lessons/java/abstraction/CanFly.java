package org.lessons.java.abstraction;

public interface CanFly {
    void fly();

    default void myFly(){
        System.out.println("I am flying(default)");
    }
}
