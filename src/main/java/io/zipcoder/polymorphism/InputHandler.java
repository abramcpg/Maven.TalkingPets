package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class InputHandler {
    private Integer petNumber;
    public ArrayList<Pet> pets;
    private Scanner scanner = new Scanner(in);

    public void getPetNumber(){
        out.println("How many pets do you have?");
        petNumber = scanner.nextInt();
        if (petNumber <= 0) {
            out.println("You MUST have a pet.. How many pets do you have?");
            petNumber = scanner.nextInt();
        }

        pets =  new ArrayList<Pet>(petNumber);
    }

    public void addPetsArray(){
        for (int i = 0; i < petNumber; i++) {
            out.println("Is that a cat, dog, or bird?");
            String type = scanner.next();
            out.println("What's it's name?");
            String name = scanner.next();
            createPet(type, name);
        }
    }

    private void createPet(String type, String name) {
       if(type.toLowerCase().equals("dog")) {
           pets.add(new Dog(name));
       }else if(type.toLowerCase().equals("cat")) {
           pets.add(new Cat(name));
       }else if(type.toLowerCase().equals("bird")) {
           pets.add(new Bird(name));
       }else out.println("That doesn't sound like any pet I know.");
    }
}
