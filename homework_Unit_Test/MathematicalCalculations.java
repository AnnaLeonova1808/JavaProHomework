package javaPro.saturday.homework_Unit_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MathematicalCalculations {
    private static List<String> resultList = new ArrayList<>();

    public MathematicalCalculations() {
        this.resultList = resultList;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;

    }

    public double multiplication(double a, double b) {
        if (b == 0)
            {
            throw new ArithmeticException("Умножение на ноль не допустимо");
            }
        return a * b;

    }

    public double division(double a, double b) {
        if (b == 0)
            {
            throw new ArithmeticException("Деление на ноль не допустимо");
            }
        return a / b;

    }

    public double raiseToPower(double number, double exponent) {
        if (exponent == 0)
            {
            throw new ArithmeticException("Возведение в степень ноль не допустимо");
            }
        return Math.pow(number, exponent);

    }

    public double logarithm(double numberX, double number) {
        if (numberX <= 0 || number <= 0 || number == 1)
            {
            throw new ArithmeticException("Не корректно выбран аргумент");
            }
        return Math.log(numberX) / Math.log(number);

    }

    public boolean evenOrOdd(double number) {
        if (number % 1 != 0)
            {
            throw new IllegalArgumentException("Число должно быть целым");
            }
        return number % 2 == 0;
    }

    public List<String> addResultsToList() {
       // List<String> resultList = new ArrayList<>();
        resultList.add("Сумма " + sum(5, 10));
        resultList.add("Разница " + subtraction(5, 10));
        resultList.add("Произведение " + multiplication(10, 5));
        resultList.add("Деление " + division(5, 10));
        resultList.add("Возведение в степень " + raiseToPower(5, 2));
        resultList.add("Логарифм числа " + logarithm(100, 10));
        return resultList;
    }
    public static List<String> modifyList(List<String> resultList){
        return resultList.stream()
                .map(el -> el + "!!!")
                .collect(Collectors.toList());

    }
    public static List<String> replaseResultsToList(String newValue) {

        return resultList.stream()
                .map(el -> newValue)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MathematicalCalculations mathematicalCalculations = new MathematicalCalculations();
        System.out.println("Сумма " + new MathematicalCalculations().sum(5, 10));
        System.out.println("Разница " + new MathematicalCalculations().subtraction(5, 10));
        System.out.println("Произведение " + new MathematicalCalculations().multiplication(10, 5));
        System.out.println("Деление " + new MathematicalCalculations().division(5, 10));
        System.out.println("Возведение в степень " + new MathematicalCalculations().raiseToPower(5, 2));
        System.out.println("Логарифм числа " + new MathematicalCalculations().logarithm(100, 10));


        List<String> resultList = mathematicalCalculations.addResultsToList();
               System.out.println("Результаты вычислений:");
        for (String result : resultList)
            {
            System.out.println(result);
            }

        List<String> modifiedList = modifyList(resultList);
        System.out.println("Измененный список результатов" + modifiedList);

        List<String>replaseList = replaseResultsToList("100");
        System.out.println("Измененный полностью список: " + replaseList);
    }
}
