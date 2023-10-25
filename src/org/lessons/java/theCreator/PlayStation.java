package org.lessons.java.theCreator;

public class PlayStation implements Device {

    String name;
    public PlayStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playable() {
        System.out.println("I am a" + name + "and I am in play mode");
    }

    @Override
    public void stoppable() {
        System.out.println("I am a" + name + "and I am in stop mode");
    }
}
