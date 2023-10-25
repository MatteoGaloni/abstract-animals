package org.lessons.java.theCreator;

public class Main {

    public static void main(String[] args) {

        Device playStation1;
        Device dvd1;

        playStation1 = Creator.create("Playstation", "Playstation3");
        dvd1 = Creator.create("Dvd", "Sony DVP-SR760H");

        if (playStation1 != null) {
            playStation1.playable();
            playStation1.stoppable();
        }
        if (dvd1 != null) {
            dvd1.playable();
            dvd1.stoppable();
        }
    }
}
