package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    int score;
    String name;

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

public class ArrayList6 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(120, "Dhanashri"));
        students.add(new Student(200, "kalyani"));
        students.add(new Student(320, "Omkar"));

        for (Student s : students) {
            System.out.println(s.getScore() + " " + s.getName());
        }

        Comparator<Student> comparator= Comparator.comparing(Student::getScore).reversed(); //using method reference
        students.sort(comparator);

//          using lamda expression

//        students.sort(((o1, o2) -> {
//            if (o2.getScore() - o1.getScore() > 0) {
//                return 1;
//            } else if (o2.getScore() - o1.getScore() < 0) {
//                return -1;
//            } else {
//                return 0;
//            }
//        }));

        System.out.println("******************************");

        for (Student s : students) {
            System.out.println(s.getScore() + " " + s.getName());
        }

    }
}
