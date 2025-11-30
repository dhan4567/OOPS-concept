package com.collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add("Kalyani");
        l1.add("Dhanashri");
        l1.add("Aaradhya");
        l1.add("Omkar");
        l1.addLast("Archana");

        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(34);
        l2.addFirst(55);


        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l2.contains(34));
        System.out.println(l2.getLast());
    }
}
