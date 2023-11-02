package javaPro.saturday.homework_23_10_28;

/**
 * Требования:
 * <p>
 * Параметризуйте класс Box так, чтобы он мог хранить
 * только объекты класса Fruit и его подклассы.
 * Добавьте метод getJuice, который принимает объект
 * класса Box и вызывает метод juice, если содержимое
 * является фруктом.
 */
public class Box<T extends Fruit> {
    private T item;

    public Box(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void getJuice() {
        if (item != null) {
            item.juice();
        }
    }
}
class Fruit {
    public void juice() {
        System.out.println("Сок");
    }
}
class Apple extends Fruit {
}
class Orange extends Fruit {
}



