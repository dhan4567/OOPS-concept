//Define:= all properties and characteristics inherited from parent class(base class) to child class(sub class). reuse functionlaity from existing class (parent class) to new class(child class)

package Inheritance;

class Person{
    void running(){
        System.out.println("person is running");

    }
    void walking(){
        System.out.println("person is walking");

    }

}
class Student extends Person{
    void standing(){
        System.out.println("student can stand ");

    }

}
public class Inherit {
    public static void main(String[]args){
        Student ram= new Student();
        ram.running();
        ram.walking();
        ram.standing();
    }

}
