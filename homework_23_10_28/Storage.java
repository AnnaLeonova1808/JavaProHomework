package javaPro.saturday.homework_23_10_28;

/**
 * Требования:
 * <p>
 * Параметризуйте класс Storage.
 * Добавьте метод getLast, который возвращает
 * последний добавленный элемент без удаления
 * его из хранилища.
 */
public class Storage<T> {
    private T[] items;
    private int count = 0;

    public Storage(int size) {
        items = (T[]) new Object[size];
    }
    public void add(T item) {
        items[count++] = item;
    }
    public T get(int index) {

        return items[index];
    }
    public T getLast() {
        if (count > 0) {
            return items[count - 1];
        }
        return null;
    }
}
