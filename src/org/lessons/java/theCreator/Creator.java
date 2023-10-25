package org.lessons.java.theCreator;

public class Creator {

    //Private Constructor
    private Creator(){

    }

    //Method
    //create a new instance Playstation/Dvd
    public static Device create(String type, String name){
        if("Playstation".equals(type)) {
            return new PlayStation(name);
        } else if ("Dvd".equals((type))){
            return new Dvd(name);
        } else return null;
    }
}
