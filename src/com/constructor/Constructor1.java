package com.constructor;


public class Constructor1 {

    private String name;
    private int age;

    public Constructor1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Constructor1 construct = new Constructor1("Dhanashri", 12);
        // construct.setName("Dhanashri");
        //construct.setAge(12);

        System.out.println(construct.getAge());
        System.out.println(construct.getName());

    }
}
