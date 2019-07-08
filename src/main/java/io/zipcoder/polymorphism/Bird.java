package io.zipcoder.polymorphism;

public class Bird extends Pet {

    private String name;

    Bird(){
        super("Princess");
    }
    Bird(String name){
        super(name);
    }
    public String speak(){
        return "Hello";
    }

    public int compareTo(Object o) {
        return 0;
    }
}