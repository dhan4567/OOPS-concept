//Method Overloading(Compile time poly) -- implement inside the single class having multiple methods where same method name but different parameters.

package com.polymorphism;

public class CompileAnimal {
    void animalSound() {
        System.out.println("**********i like elephant***********");

    }

    void animalSound(String name) {
        System.out.println("***********i like tiger******************* ");

    }

    public static void main(String[] args) {
        CompileAnimal animal = new CompileAnimal();
        animal.animalSound();
        animal.animalSound("lion");


    }
}
