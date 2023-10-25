package org.lessons.java.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Rex"), new Dolphin("Flipper"), new Eagle("California"), new Sparrow("Alex")};

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

        CanFly myBird = new Sparrow("Franceschino");
        CanSwim myDolphin = new Dolphin("Pino");

        makeFly(myBird);
        makeSwim(myDolphin);


    }
    public static void makeFly(CanFly theOneFlying){
        theOneFlying.fly();
        System.out.println("uso il metodo con il parametro");
    }

    public static void makeSwim(CanSwim theOneSwimming){
        theOneSwimming.swim();
        System.out.println("uso il metodo con il parametro");
    }
}

