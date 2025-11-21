//Constructor in inheritance -- when you create object for derived(child) class then it first goes to parent constructor calling,and after that going to implement child constructor calling
package com.constructor;

class Student{
    public String name;
    public int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("heyy omkar");
    }
    public void getStudentDetails(){
        System.out.println(this.name+this.age);
    }

}
class Child extends Student{
    public Child(String name,int age){
        super(name, age);
        System.out.println("hello ,how are you");
    }
    public void getChildDetails(){
        System.out.println(this.name+this.age);
    }

}

public class Constructor5 {
    public static void main(String[] args) {
       Student s = new Student("Dhanashri",22);
       s.getStudentDetails();
       Child c = new Child("omkar",26);
       c.getChildDetails();

    }
}
