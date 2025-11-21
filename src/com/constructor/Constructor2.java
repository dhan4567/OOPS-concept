package com.constructor;

public class Constructor2 {

    private String name;
    private int age;

    public Constructor2(String y,int x){
        this.name=y;
        this.age=x;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Constructor2 myConstruct = new Constructor2("Dhanashri",12);
        String str=myConstruct.getName();
        System.out.println(str);
        int str2=myConstruct.getAge();
        System.out.println(str2);

    }
}
