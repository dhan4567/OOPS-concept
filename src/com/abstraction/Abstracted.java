/* abstract class - this is only standard not a class ,this class doesn't have any object ,we can't create any object by using this abstract class,this class only follow some rule to method implementation inside concrete class ,
abstract method - is the method which don't contain method body,each abstract class having at least one abstract method,if any one method existing as a abstract in the class,then we should have to make this class as abstract..
abstract class also contains non-abstract methods also.abstract methods should be override in the concrete class implemetation of derived class
otherwise make derived class as abstract if you won't override the abstract methods in the concrete implementation*/


package com.abstraction;

abstract class Shape {

    public void alignment() {
        System.out.println("all shapes having different shapes and alignments of sides and angles");

    }

    abstract void calculateArea();

    abstract void calculatePerimeter();

}


class Rectangle extends Shape {
    int length = 5;
    int width = 4;

    @Override
    public void calculateArea() {
        System.out.println("area of rectangle is a:" + (length * width));

    }


    public void calculatePerimeter() {
        System.out.println("perimeter of rectangle is:" + (length + width) * 2);

    }
}

class Square extends Shape {
    int side = 4;

    @Override
    public void calculateArea() {
        System.out.println("area of square is:" + (side * side));

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("perimeter of square is:" + (4 * side));

    }

}

public class Abstracted {
    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Square();
        s1.calculateArea();
        s2.calculatePerimeter();
        s2.calculateArea();
        s1.calculatePerimeter();

    }
}


