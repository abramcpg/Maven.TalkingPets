package io.zipcoder.polymorphism;

public class Cat extends Pet {

    private String name;

    Cat(){
        super("Simba");
    }
    Cat(String name){
        super(name);
    }
    public String speak(){
        return "Meow";
    }

    public int compareTo(Object o) {
        return 0;
    }
}
