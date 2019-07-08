package io.zipcoder.polymorphism;

import static java.lang.System.out;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {
        InputHandler input = new InputHandler();

        input.getPetNumber();
        input.addPetsArray();

        for (Pet p: input.pets) {
            out.println(p.getName());
            out.println(p.speak());
        }
    }
}
