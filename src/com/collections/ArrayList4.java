package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(43);
        list.add(54);
        list.add(73);

        list.sort(null);  //natural ascending ordering
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);  //to extend first array
        list2.add(23);
        System.out.println(list2);

    }
}
