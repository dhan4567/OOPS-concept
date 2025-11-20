//interface also not able to create object,because interface fields and methods are static,final and public ,but reference of interface can exist, methods that exist inside the interface those all are abstract methods and interface should be forcefully apply and execute those methods inside the concrete implementation

package com.interfac;

interface Shape {
    void area();

    void perimeter();

}

class Square implements Shape {

    int side = 3;


    public void area() {
        System.out.println("area of square is:" + (side * side));

    }

    public void perimeter() {
        System.out.println("perimeter of square is:" + (4 * side));

    }

}

class Rectangle implements Shape {
    int length = 2;
    int width = 4;

    public void area() {
        System.out.println("area of rectangle is a:" + (length * width));
        ;

    }

    public void perimeter() {
        System.out.println("perimeter of rectangle is:" + (length + width) * 2);

    }

}

public class Interfaced {
    public static void main(String[] args) {
        Shape s1 = new Square();
        Shape s2 = new Rectangle();
        s1.area();
        s2.perimeter();
        s2.area();
        s2.perimeter();

    }
}
