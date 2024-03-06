package javaPro.homework_210823.homework_24_03_04;

public class BakeryCinnabon {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();

        DoughMixer doughMixer = new DoughMixer(bakery);
        BakerBuns bakerBuns = new BakerBuns(bakery);
        CreamCoated creamCoated = new CreamCoated(bakery);

        Thread tr1 = new Thread(doughMixer);
        Thread tr2 = new Thread(bakerBuns);
        Thread tr3 = new Thread(creamCoated);

        tr1.start();
        tr2.start();
        tr3.start();
    }
}

class Bakery {
    private int doughMixer = 0;
    private int bunsBaked = 0;
    private int creamСoating = 0;
    private boolean isDoughMixerDone = false;
    private boolean isBakerDone = false;

    public synchronized void doughMixerForBakery() {
        while (doughMixer >= 6) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        doughMixer += 6;
        System.out.println("Замес теста выполнен: " + doughMixer + " Тесто передано пекарю ");
        isDoughMixerDone = true;
        notifyAll();
    }

    public synchronized void bakingBuns() {
        while (!isDoughMixerDone || bunsBaked >= 6) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bunsBaked += 6;
        System.out.println("Пекарь выпек булочки: " + bunsBaked + " Булочки переданы кондитеру ");
        isBakerDone = true;
        notifyAll();
    }

    public synchronized void creamCoating() {
        while (!isBakerDone || creamСoating >= 6) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        creamСoating += 6;
        System.out.println("Кондитер покрыл булочки кремом: " + creamСoating + " Булочки готовы ");
        if (creamСoating == 6) {
            doughMixer = 0;
            bunsBaked = 0;
            creamСoating = 0;
            isDoughMixerDone = false;
            isBakerDone = false;
            System.out.println("Передать булочки на витрину.");
        }
        notifyAll();
    }
}

class DoughMixer implements Runnable {
    Bakery bakery;

    public DoughMixer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bakery.doughMixerForBakery();
        }
    }
}

class BakerBuns implements Runnable {
    Bakery bakery;

    public BakerBuns(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bakery.bakingBuns();
        }
    }
}

class CreamCoated implements Runnable {
    Bakery bakery;

    public CreamCoated(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            bakery.creamCoating();
        }
    }
}








