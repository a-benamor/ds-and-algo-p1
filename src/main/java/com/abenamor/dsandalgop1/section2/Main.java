package com.abenamor.dsandalgop1.section2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author abenamor on 31/03/2020
 */
public class Main {
    public static void main(String[] args) {
        CustomArray numbers = new CustomArray(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.print();
        numbers.insertAt(15,1);
        numbers.print();


      /*  System.out.println("--------------------------");
        System.out.println("---- After reversion ----");
        numbers.reverseV2();
        numbers.print();

      System.out.println("---- Intersection ----");
        System.out.println(Arrays.toString(result));

        numbers.insert(40);
        numbers.print();

        System.out.println("--------------------------");
        numbers.removeAt(1);
        numbers.print();

        System.out.println("index of 40: " + numbers.indexOf(40));
        System.out.println("index of 10: " + numbers.indexOf(10));
        System.out.println("index of 100: " + numbers.indexOf(100));

        System.out.println("Maximum");
        System.out.println(numbers.getMax());*/
    }
}
