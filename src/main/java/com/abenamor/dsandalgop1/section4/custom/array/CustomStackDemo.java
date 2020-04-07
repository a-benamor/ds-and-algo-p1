package com.abenamor.dsandalgop1.section4.custom.array;

/**
 * @author abenamor on 06/04/2020
 */
public class CustomStackDemo {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(4);
        System.out.println("isEmpty: " + customStack.isEmpty());
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);
        customStack.push(40);
        System.out.println("size: " + customStack.size());
        customStack.push(50);
        System.out.println("size: " + customStack.size());
        System.out.println(customStack);

        System.out.println("pop: " + customStack.pop());
        System.out.println("size: " + customStack.size());
        System.out.println("peek: " + customStack.peek());
        System.out.println("size: " + customStack.size());
        System.out.println(customStack);

    }
}
