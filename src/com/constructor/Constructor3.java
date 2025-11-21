package com.constructor;

public class Constructor3 {

    public Constructor3(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        Constructor3 myConstruct= new Constructor3();
        System.out.println(myConstruct);

    }
}
