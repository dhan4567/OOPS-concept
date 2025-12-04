package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Banana","Orange","Mango","Guava");  //Arrays.asList--> having fixed size of element we cannot shrink and grow these array.we only replace it.
        System.out.println(list);
        list.set(1,"Apple");
        System.out.println(list);
//        list.add(4,"pineapple");  --raise exception in thread "main" java.lang(unsupportedOperationException)
//        System.out.println(list);
        System.out.println(list.getClass().getName());

        System.out.println("***************************");

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(23);
        list2.add(45);
        list2.add(40);

        System.out.println(list2);
        System.out.println(list2.getClass().getName());

        System.out.println("****************************");

        List<Double> list3 = List.of(20.3,11.2,45.5); //List.of --> we cannot replace the elemnets and shrink,grow these array size
        System.out.println(list3);
        System.out.println(list3.getClass().getName());

        System.out.println("************************");


    }
}
