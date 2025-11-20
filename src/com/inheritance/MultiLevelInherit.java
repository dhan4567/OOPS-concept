package com.inheritance;

class Animal {
    void makeSound() {
        System.out.println("All animals having different sounds");

    }

}

class Cat extends Animal {
    void meow() {
        System.out.println("cat having sound like meow");

    }

}

class Dog extends Cat {
    void bark() {
        System.out.println("dog is barked");
    }

}

public class MultiLevelInherit {
    public static void main(String[] args) {
        Cat money = new Cat();
        Dog doggy = new Dog();
        money.meow();
        money.makeSound();
        doggy.bark();

    }
}
