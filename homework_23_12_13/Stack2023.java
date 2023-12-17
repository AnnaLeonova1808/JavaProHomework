package javaPro.homework_210823.homework_23_12_13;

import java.util.ArrayList;

public interface Stack2023<T> {
    void put(T element); //put
    boolean isEmpty(); //
    T get();
}

class StackImpl<T> implements Stack2023<T> {
    ArrayList<T> stack = new ArrayList<>();

    @Override
    public void put(T element) {
        stack.add(element);

    }

    @Override
    public boolean isEmpty() {

        return stack.isEmpty();
    }

    @Override
    public T get() {

        return stack.remove(stack.size()-1);
    }
}
