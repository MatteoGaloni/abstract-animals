package org.lessons.java.theCreator;

public class Main {

    public static void main(String[] args) {

        Creator creator = new Creator();

        Device playStation = creator.create("Playstation", "PlayStation 2");
        Device dvd = creator.create("Dvd", "Sony DVP-SR760H ");

        playStation.playable();
        playStation.stoppable();

        dvd.playable();
        dvd.stoppable();
    }
}
