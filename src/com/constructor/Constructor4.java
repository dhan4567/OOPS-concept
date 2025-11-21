//constructor overloading- achieved via default and parameterized constructor
package com.constructor;

public class Constructor4 {
    private String name;
    private int age;

    public Constructor4() {
        System.out.println("no arguments");

    }
    public Constructor4(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void getName() {
        System.out.println(this.name);
    }

    public void getAge() {
        System.out.println(this.age);
    }

    public static void main(String[] args) {
       // Constructor4 myConstruct = new Constructor4();
        Constructor4 myConstruct = new Constructor4("omkar",12);
        myConstruct.getName();
        myConstruct.getAge();


    }
}
