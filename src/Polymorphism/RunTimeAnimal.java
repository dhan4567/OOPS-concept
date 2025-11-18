//Method Overriding:= Achieved via inheritance (run time polymorphism) where multiple methods having same name with same method parameters

package Polymorphism;

class Animal{
    void makeSound(){
        System.out.println("animal makes sound");
    }
    void breath(String type){
        System.out.println("some animals takes long breath");

    }

}
class Dog extends Animal {
    void makeSound(){
        System.out.println("dog makes sound");

    }
    void breath(String type){
        System.out.println("some animals takes deep breath");

    }

}
public class RunTimeAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        Animal poly = new Dog();

        d.breath("small breath");
        a.breath("long breath");
        d.makeSound();
        a.makeSound();
        poly.breath("Deep breath");

    }
}
