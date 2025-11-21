//static constructor :modifier static is not allowed here,non-static variable "this" cannot be referenced form a static context
package com.constructor;

public class Constructor6 {
    String name;
    int age;
    static String clgName;

//    static Constructor6(String name,int age){
//        this.name=name;
//        this.age=age;
//        System.out.println(this.name+this.age);

//    }

    public Constructor6(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+" "+this.age);
    }


    public static void main(String[] args) {
        Constructor6 myConstruct= new Constructor6("Dhanashri",12);

    }
}
