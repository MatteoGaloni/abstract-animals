package org.lessons.java.abstraction;

public abstract class Animal {
    //ATTRIBUTES
    String name;

    //CONSTRUCTORS
    public Animal(String name) {
        this.name = name;
    }

    //METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //**************//
    private void sleep(){
        System.out.println("Zzz");
    }

    public abstract void roar();

    public abstract void eat();
}
