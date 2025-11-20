//Data Hiding: Encapsulation restricts direct access to class variables, protecting sensitive data from unauthorized access.


package com.encapsulation;

class Student {

    private String name;
    private int rollNo;

    public void setName(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class BindedData {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Dhanashri", 25);
        System.out.println("student details:" + s.getName() + "," + s.getRollNo());
    }
}