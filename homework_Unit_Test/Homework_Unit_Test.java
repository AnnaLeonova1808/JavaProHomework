package javaPro.saturday.homework_Unit_Test;

public class Homework_Unit_Test {
   public double sum(double a, double b) {
        return a + b;
   }

    public double substraction(double a, double b) {
        return a - b;

    }

    public double multiplication(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("Умножение на ноль не допустимо");
        }
        return a * b;

    }

   public double division(double a, double b) {
       if(b == 0) {
           throw new ArithmeticException("Деление на ноль не допустимо");
       }
        return a / b;

    }
    public double raiseToPower(double number, double exponent) {
        if(exponent == 0) {
            throw new ArithmeticException("Возведение в степень ноль не допустимо");
        }
        return Math.pow(number, exponent);

    }
    public double logarithm (double numberX, double number) {
        if(numberX <= 0 || number <= 0 || number == 1) {
            throw new ArithmeticException("Не корректно выбран аргумент");
        }
        return Math.log(numberX) / Math.log(number);

    }
    public boolean evenOrOdd (double number){
       if (number % 1 != 0){
           throw new IllegalArgumentException("Число должно быть целым");
       }
       return number % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("Сумма " + new Homework_Unit_Test().sum(5, 10));
        System.out.println("Разница " + new Homework_Unit_Test().substraction(5, 10));
        System.out.println("Произведение " + new Homework_Unit_Test().multiplication(10, 5));
        System.out.println("Деление " + new Homework_Unit_Test().division(5, 10));
        System.out.println("Возведение в степень " + new Homework_Unit_Test().raiseToPower(5, 2));
        System.out.println("Логарифм числа " + new Homework_Unit_Test().logarithm(100, 0));
    }
}
