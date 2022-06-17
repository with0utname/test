package threadd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author tututyl
 * @Date 2022-05-31
 */
public class IAdd {
    final static public Ta a = new Ta();
    volatile static Integer i = -127;

    public static void main(String[] args) {
//        Thread t1 = new ThreadTest();
//        Thread t2 = new ThreadTest();
//        Thread t3 = new ThreadTest();
//        t1.start();
//        t2.start();
//        t3.start();
        Ta ta = new Ta();
        String name = ta.name;
        ta.name="hello";
        System.out.println(name);
        System.out.println(ta.name);
        Ta ta1 = new Ta();
        System.out.println(ta1.name);

        a.count=3;
        int a = Ta.age;
        a=1;
        System.out.println(ta.age);

    }
    public static class Ta{
        public static String name;
        public static int age = 0;
        public int count;
    }

    public static  class ThreadTest extends Thread {

        private static final Lock lock = new ReentrantLock();

        void hello(final String a){};

        @Override
        public void run() {
            for (int j = 0; j < 20000; j++) {
                synchronized (i) {
                    i++;
                    System.out.println(i);
                }
            }
        }
//        @Override
//        public void run() {
//            for (int j = 0; j < 100000; j++) {
//                try {
//                    lock.lock();
//                    i++;
//                    synchronized (i){
//
//                    }
//                    if (System.currentTimeMillis()%33==0){
//                        throw new RuntimeException("hello");
//                    }
//                    System.out.println(i);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    lock.unlock();
//                }
//            }
//        }
    }
}
