package javaPro.saturday.homework_Unit_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MathematicalCalculations_Unit_TestTest
{
    private static final MathematicalCalculations Test_1 = new MathematicalCalculations();
    private static final double PARAM_A = 10;
    private static List<String> resultList = new ArrayList<>();

    @BeforeAll
    static void setUp() {
        resultList = Test_1.addResultsToList();
    }

    @Test
    void sum() {
        double expected = 15;
        double b = 10;

        Assertions.assertEquals(expected, Test_1.sum(MathematicalCalculations_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void subtraction() {
        double expected = 5;
        double b = 5;
        Assertions.assertEquals(expected, Test_1.subtraction(MathematicalCalculations_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void multiplication() {
        double expected = 50;
        double b = 5;
        Assertions.assertEquals(expected, Test_1.multiplication(MathematicalCalculations_Unit_TestTest.PARAM_A, b));
    }

    @Test
    void division_by_Zero() {
        Assertions.assertThrows(ArithmeticException.class, () -> MathematicalCalculations_Unit_TestTest.Test_1.division(PARAM_A, 0));

    }

    @Test
    void raiseToPower() {
        double expected = 10000000000.0;
        double b = 10;
        Assertions.assertEquals(expected, Test_1.raiseToPower(MathematicalCalculations_Unit_TestTest.PARAM_A, b));

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
        Assertions.assertEquals(expected, Test_1.logarithm(b, MathematicalCalculations_Unit_TestTest.PARAM_A));
    }

    @Test
    void evenOrOdd() {
        boolean expected = true;
        Assertions.assertEquals(expected, Test_1.evenOrOdd(MathematicalCalculations_Unit_TestTest.PARAM_A));
    }

    @Test
    void testAddResultsToList() {
        int expectedSize = 6;
        Assertions.assertEquals(expectedSize, resultList.size());
    }

    @Test
    void isPositiveResultTest() {
        Assertions.assertTrue(resultList.contains("Сумма 15.0"));
        Assertions.assertTrue(resultList.contains("Разница -5.0"));
        Assertions.assertTrue(resultList.contains("Произведение 50.0"));
        Assertions.assertTrue(resultList.contains("Деление 0.5"));
        Assertions.assertTrue(resultList.contains("Возведение в степень 25.0"));
        Assertions.assertTrue(resultList.contains("Логарифм числа 2.0"));
    }

    @Test
    void isNegativeTest() {
        Assertions.assertFalse(resultList.isEmpty());
    }

    @Test
    void testReplaceResultsToListTest() {
        String newValue = "New Value";
        List<String> resultList = Test_1.replaseResultsToList(newValue);
        int expectedSize = 6;
        Assertions.assertEquals(expectedSize, resultList.size());
        for (String element : resultList)
            {
            Assertions.assertEquals(newValue, element);
            }
    }

    @Test
    void isPositiveResultReplaceToListTest() {
        String newValue = "New Value";
        List<String> resultList = Test_1.replaseResultsToList(newValue);
        Assertions.assertTrue(resultList.contains(newValue));
    }
}
