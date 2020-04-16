package com.abenamor.dsandalgop1.section4;

import java.util.Stack;

/**
 * @author abenamor on 04/04/2020
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        System.out.println(integerStack);
        System.out.println("peek method: " + integerStack.peek());
        System.out.println(integerStack);
        System.out.println("pop method: " + integerStack.pop());
        System.out.println(integerStack);
    }
}
