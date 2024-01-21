package javaPro.homework_210823.homework_24_01_15;

import java.lang.reflect.Field;
import java.util.List;

//Напишите метод, который принимает список объектов и
// возвращает среднее значение заданного числового поля всех объектов в списке.
public class AverageField {
    public static <T> double averageFieldValue(List<T> objects, String fieldName)
            throws NoSuchFieldException {
        Field field = getField(objects.get(0).getClass(), fieldName);
        field.setAccessible(true);

        double sum = 0.0;

        for (T obj : objects) {
            Object value = null;
            try {
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            if (value instanceof Number) {
                sum += ((Number) value).doubleValue();
            }
        }

        return sum / objects.size();
    }

    private static Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            if (clazz.getSuperclass() != null) {
                return getField(clazz.getSuperclass(), fieldName);
            }
            throw e;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException {
        List<MyObject> objects = List.of(new MyObject(10), new MyObject(20), new MyObject(30));

        double average = averageFieldValue(objects, "value");

        System.out.println("Среднее значение поля 'value': " + average);
    }
}

class MyObject {
    private int value;

    public MyObject(int value) {
        this.value = value;
    }
}

