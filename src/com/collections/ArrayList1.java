package com.collections;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(1);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.set(3, 7);
        a1.remove(1);
        System.out.println(a1);
        a2.add(3);
        a2.add(11);
        a2.add(15);
        System.out.println(a1.size());
        a1.clear();
        a1.addAll(a2);


        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        System.out.println(a1.contains(4));
        System.out.println(a1.indexOf(5));   //if element is not exist in arraylist then it will gives index as -1.
        System.out.println(a1.lastIndexOf(3));
        System.out.println(a1.size());


    }
}
