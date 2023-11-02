package javaPro.saturday.homework_23_10_28;

/**
 * Требования:
 * <p>
 * Параметризуйте класс FoodProcessor так, чтобы он
 * мог кормить только объекты класса Animal и его
 * подклассы.
 * Добавьте логику в метод feed, чтобы он выводил
 * сообщение вида: "[животное] съело: [что-то вкусное]",
 * используя метод eat из класса Animal.
 */
public class FoodProcessor<T extends Animal> {
    public void feed(T animal, String food) {

        System.out.println("Покормили " + animal.toString() + animal.eat(food));
    }
}

class Animal {
    public String eat(String food) {
        return "ом-ном-ном";
    }
}

class Cat extends Animal {
    @Override
    public String eat(String food) {
        return "cat" + food;
    }
}

class Dog extends Animal {
    @Override
    public String eat(String food) {
        return "dog" + food;
    }
}

