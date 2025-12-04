//To use comparator -> implement comparator in class or via lambda expression or via method reference

package com.collections;

import java.util.ArrayList;
import java.util.Comparator;

class OrderingOFInteger implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(11);
        list.add(95);
        list.add(23);
        list.add(34);
        list.add(55);

        System.out.println(list);
//
//        list.sort(new OrderingOFInteger());  // implemented Comparator interface
//        System.out.println(list);


        list.sort((a,b)->b-a);  //By using lambda expression
        System.out.println(list);
    }
}
