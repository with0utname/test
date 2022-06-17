package threadd;

/**
 * @Author tututyl
 * @Date 2021-12-23
 */
public class TestThread extends Thread {
    private static int A = 0;

    public synchronized void run() {
        A = 1;
        while (A == 1) {
            synchronized (TestThread.class) {
                try {
                    System.out.println("睡了" + Thread.currentThread().getId());
                    sleep(0);
                    System.out.println("醒了" + Thread.currentThread().getId());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    A = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            TestThread testThread = new TestThread();
            testThread.start();
        }

    }
}
