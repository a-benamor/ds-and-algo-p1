package com.abenamor.dsandalgop1.section4.minstack;

/**
 * @author abenamor on 07/04/2020
 */
public class MinStackDemo {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.push(5);
        customStack.push(2);
        customStack.push(10);
        customStack.push(1);
        System.out.println(customStack.toString());
        System.out.println("Min: " + customStack.min());
        customStack.pop();
        System.out.println("Min: " + customStack.min());
        System.out.println(customStack.toString());
        customStack.pop();
        System.out.println(customStack.toString());

    }

}
