import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class ThreadCounter {
    private static int threadCount = 0;
    private static final Lock lock = new ReentrantLock();
    public static void displayThreadCount() {
        lock.lock();
        try {
            System.out.println("Number of threads in use: " + threadCount);
        } finally {
            lock.unlock();
        }
    }
    public static void countThread() {
        lock.lock();
        try {
            threadCount++;
        } finally {
            lock.unlock();
        }
    }
}
class ChildThread extends Thread {
    private int threadNum;
    public ChildThread(int threadNum) {
        this.threadNum = threadNum;
    }
    public void run() {
        System.out.println("Child Thread " + threadNum + " started");
        ThreadCounter.countThread();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Child Thread " + threadNum + " ended");
    }
}
public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Displaying number of threads in use:");
        ThreadCounter.displayThreadCount();
        System.out.println();
        System.out.println("Demonstrating join():");
        joinDemo();
        System.out.println();
        System.out.println("Printing Multiplication Table using Thread Synchronization:");
        printMultiplicationTable();
        System.out.println();
        System.out.println("Running threads with priorities:");
        runThreadsWithPriority();
    }
    public static void joinDemo() {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ChildThread(i);
            threads[i].start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
                System.out.println("Thread joined");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("All threads joined");
    }
    public static void printMultiplicationTable() {
        Lock lock = new ReentrantLock();
        for (int i = 2; i <= 5; i++) {
            final int table = i;
            new Thread(() -> {
                lock.lock();
                try {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(table + " x " + j + " = " + (table * j));
                }
                } finally {
                    lock.unlock();
                }
                }
            ).start();
        }
    }
    public static void runThreadsWithPriority() {
        Runnable runningFunction = () -> {
            System.out.println("Thread started.");
            while (Thread.currentThread().isAlive()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Click detected.");
            }
            System.out.println("Thread terminated.");
        };
        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runningFunction);
            threads[i].setDaemon(true);
            threads[i].start();
        }
        threads[0].setPriority(Thread.MAX_PRIORITY);
        threads[1].setPriority(Thread.NORM_PRIORITY);
        threads[2].setPriority(Thread.MIN_PRIORITY);
        for (Thread thread : threads) {
            System.out.println("Thread is alive: " + thread.isAlive());
        }
        for (Thread thread : threads) {
            try {
                thread.join();
                System.out.println("Thread terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}