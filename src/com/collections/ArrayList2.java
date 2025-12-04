//Arraylist initially contains 10 default capacity, when you goes out of capacity then new array arises, and then it copied all data from old array to new array.
//capacity - Is the defined space for array element,also we can defined it like this --[List<E> list=new ArrayList<12>();]
//size -  Occupied space of elements.


package com.collections;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() ;
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(40);

        arrayList.remove(Integer.valueOf(40));
        arrayList.remove(Integer.valueOf(40));
        arrayList.remove(Integer.valueOf(40));
        arrayList.remove(Integer.valueOf(40));
        arrayList.remove(Integer.valueOf(40));
        arrayList.remove(Integer.valueOf(40));

        System.out.println(arrayList.size());

        for (int x : arrayList) {
            System.out.print(x);
            System.out.print(" ");
        }

    }
}
