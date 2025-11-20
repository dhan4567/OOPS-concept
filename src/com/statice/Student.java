//static methods and variable are useful for memory management,because without creating object we can access to the method using class name
//static block always execute before the main method, memory allocation does to the static methods and static variable at the time of class loaded in the memory.
package com.statice;

class Check{
    static{
        System.out.println("hello");

    }
}
public class Student {
    String name;
    int rollNo;
    static String clgName; //common for all student,make it static(allocate memory at once,not for very student)

    public String displayName(){
        return "Dhanashri";

    }
    static void displayRollNo(){
        //displayName(); //Static methods only access to static methods and static data members
        System.out.println("my roll no is a 2"); //this and super keyword not allowed in static methods
    }
    public static void main(String[] args) {

        Student s = new Student();
        String r=s.displayName();
        System.out.println(r);
       // s.displayRollNo();//static method we won't access using object,it can access from using class name
        Student.displayRollNo();

    }
}
