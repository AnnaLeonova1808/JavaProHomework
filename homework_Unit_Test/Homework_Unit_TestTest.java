package javaPro.saturday.homework_Unit_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Homework_Unit_TestTest {
    private static final Homework_Unit_Test Test_1 = new Homework_Unit_Test();
    private static final double PARAM_A = 10;

    @Test
    void sum() {
        double expected = 15;
        double b = 10;

        Assertions.assertEquals(expected, Test_1.sum(Homework_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void substraction() {
        double expected = 5;
        double b = 5;
        Assertions.assertEquals(expected, Test_1.substraction(Homework_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void multiplication() {
        double expected = 50;
        double b = 5;
        Assertions.assertEquals(expected, Test_1.multiplication(Homework_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void division_by_Zero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Homework_Unit_TestTest.Test_1.division(PARAM_A, 0));

    }

    @Test
    void raiseToPower() {
        double expected = 10000000000.0;
        double b = 10;
        Assertions.assertEquals(expected, Test_1.raiseToPower(Homework_Unit_TestTest.PARAM_A, b));

    }
    @Test
    void raiseToPower_withNegativeExponent() {
        double number = 5;
        double exponent = -2;

        ArithmeticException thrownException = Assertions.assertThrows(ArithmeticException.class,
                () -> Test_1.raiseToPower(number, exponent));

        Assertions.assertEquals("Возведение в отрицательную степень не допустимо", thrownException.getMessage());
    }

    @Test
    void logarithm() {
        double expected = 2.0;
        double b = 100;
        Assertions.assertEquals(expected, Test_1.logarithm(b, Homework_Unit_TestTest.PARAM_A));
    }

    @Test
    void evenOrOdd() {
        boolean expected = true;
        Assertions.assertEquals(expected, Test_1.evenOrOdd(Homework_Unit_TestTest.PARAM_A));
    }
}