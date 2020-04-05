package com.abenamor.dsandalgop1.section4.reversingstring;

import com.abenamor.dsandalgop1.section4.BalanceCharacter;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author abenamor on 05/04/2020
 */
public class ExpressionChecker {
    private final List<Character> leftBrackets = Arrays.asList(BalanceCharacter.OPENING_BRACE, BalanceCharacter.OPENING_PARENTHESIS);
    private final List<Character> rightBrackets = Arrays.asList(BalanceCharacter.CLOSING_BRACE , BalanceCharacter.CLOSING_PARENTHESIS);
    public boolean isBalance(String input) {
        Stack<Character> characterStack = new Stack<>();
        for (char curElem: input.toCharArray()) {
            if (isLeftBracket(curElem)) {
                characterStack.push(curElem);
            }
            if (isRightBracket(curElem)) {
                if (characterStack.isEmpty()) return false;

                char top = characterStack.pop();
                if (!bracketMatches(top, curElem)) return false;
            }
        }
        return characterStack.empty();
    }

    private boolean isLeftBracket(char input) {
        return leftBrackets.contains(input);
    }

    private boolean isRightBracket(char input) {
        return rightBrackets.contains(input);
    }

    private boolean bracketMatches(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
