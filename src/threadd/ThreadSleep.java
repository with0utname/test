package threadd;

/**
 * @Author tututyl
 * @Date 2022-02-21
 */
public class ThreadSleep {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("hello "+i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
