class SharedResource1 {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

public class ThreadSynchronyzation {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                resource.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Final Counter Value: " + resource.getCounter());
    }
}
