package javaPro.homework_210823.homework_24_03_04;

public class WN {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);

        Thread prodThread = new Thread(producer);
        Thread consThread = new Thread(consumer);

        prodThread.start();
        consThread.start();
    }
}

class Storage {
    private int item = 0;

    public synchronized void getItem() {
        while (item < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item--;
        System.out.println("Customer has bought one item. Quantity: " + item);
        notify();
    }

    public synchronized void putItem() {
        while (item >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item++;
        System.out.println("Factory put one item into the Storage. Quantity: " + item);
        notify();
    }
}

class Producer implements Runnable {
    Storage storage;
    public Producer(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.putItem();
        }
    }
}

class Consumer implements Runnable {
    Storage storage;
    public Consumer(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.getItem();

        }
    }
}

