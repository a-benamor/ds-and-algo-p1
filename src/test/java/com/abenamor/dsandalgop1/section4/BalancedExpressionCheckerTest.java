package com.abenamor.dsandalgop1.section4;

import com.abenamor.dsandalgop1.section4.reversingstring.ExpressionChecker;
import org.junit.jupiter.api.*;

/**
 * @author abenamor on 04/04/2020
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BalancedExpressionCheckerTest {
    private ExpressionChecker expressionChecker;
    @BeforeAll
    public void init() {
        expressionChecker = new ExpressionChecker();
    }

    @Test
    public void givenExpression_thenSuccess() {
        Assertions.assertTrue(expressionChecker.isBalance("abc(254)bv"));
        Assertions.assertTrue(expressionChecker.isBalance("abc(254{5g}23)bv"));
        Assertions.assertFalse(expressionChecker.isBalance("abc(254(bv"));
        Assertions.assertFalse(expressionChecker.isBalance(")abcvc("));
        Assertions.assertFalse(expressionChecker.isBalance("{)abcvc(}"));
    }
}
