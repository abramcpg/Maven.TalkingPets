package io.zipcoder.polymorphism;

public class Dog extends Pet {

    private String name;

    Dog(){
        super("Buddy");
    }
    Dog(String name){
        super(name);
    }
    public String speak(){
        return "Bark";
    }

    public int compareTo(Object o) {
        return 0;
    }
}