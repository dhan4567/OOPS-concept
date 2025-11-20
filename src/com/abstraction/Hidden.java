/*Abstraction:= hide unnecessary details from users and shown only necessary details to them.
Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.

Abstraction hides the complex details and shows only essential features.
Abstract classes may have methods without implementation and must be implemented by subclasses.

*/

package com.abstraction;


abstract class Animal {
    abstract void makeSound(); //concrete method

    void breath() {
        System.out.println("animals take a long breath");
    }

}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("cat makes sound as meow");
    }

}

public class Hidden {
    public static void main(String[] args) {
        Animal abs = new Cat();
        abs.breath();
        abs.makeSound();

    }

}
