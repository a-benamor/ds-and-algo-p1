package com.abenamor.dsandalgop1.section4.reversingstring;

import java.util.Stack;

/**
 * @author abenamor on 04/04/2020
 */
public class Main {

    public static void main(String[] args) {
        String input = null;
        String inputReversed = reverseString(input);
        System.out.println(inputReversed);
    }

    private static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input must be not null");
        }
        StringBuilder result = new StringBuilder(input.length());
        Stack<Character> characterStack = new Stack<>();
        for (char curChar: input.toCharArray()) {
            characterStack.push(curChar);
        }
        while (!characterStack.isEmpty()){
            result.append(characterStack.pop());
        }
        return result.toString();
    }
}
