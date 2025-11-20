/*Multiple Inheritance is an object-oriented concept where a class can inherit from more than one parent class. While powerful, it can cause ambiguity when multiple parents have the same methods.

If two of the parent classes have a method with the same signature, the compiler cannot determine which one to execute.
This ambiguity is the reason Java does not support multiple inheritance with classes.

but we can achieve multiple inheritance by using interface concept
*/

package com.inheritance;

interface a {
    default void display() {
        System.out.println("aaaaaaaaaaaaaaa");
    }

}

interface b {
    default void display() {
        System.out.println("bbbbbbbbbbbbbbbb");
    }

}

class c implements a, b {
    @Override
    public void display() {
        a.super.display();
        b.super.display();
        System.out.println("class c display");

    }
}

public class MultipleInherit {
    public static void main(String[] args) {
        c obj = new c();
        obj.display();
    }

}
