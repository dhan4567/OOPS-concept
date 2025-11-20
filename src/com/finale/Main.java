/*final class,final method and final variable
final variable=declared once,cannot change the value once initialized
final method= not allowed method overriding
final class= stop extending class and inheritance implementation
*/

package com.finale;


final class Parent {
    final public void displayName() {
        System.out.println(" my parent name is Dinkar");
    }

}

//class Child extends Parent {

//    public void displayName() {
//        System.out.println("my name is omkar");
//    }

//}

public class Main {
    final int rollNo = 22;
    //  int rollNo=23;

    public static void main(String[] args) {
//        Child c = new Child();
//        c.displayName();


    }
}
