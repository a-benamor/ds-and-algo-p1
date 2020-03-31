package com.abenamor.dsandalgop1.section3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author abenamor on 31/03/2020
 * Demo to use LinkedList DS: it implements List Interface.
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println(linkedList.toString());
       var regularArr =  linkedList.toArray();
       System.out.println(regularArr.toString());
        for (Object curObj: regularArr) {
            System.out.println(((Integer) curObj).toString() );
        }
    }
}
