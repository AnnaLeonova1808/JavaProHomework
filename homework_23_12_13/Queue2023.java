package javaPro.homework_210823.homework_23_12_13;

import java.util.LinkedList;
import java.util.Queue;

public interface Queue2023<T> {
    void offer(T element);
    boolean isEmpty();
    T pool();
}

class MyQueue<T> implements Queue2023<T> {
    Queue<T> queue = new LinkedList<>();

    @Override
    public void offer(T element) {
        queue.offer(element);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public T pool() {
        return queue.poll();
    }
}
