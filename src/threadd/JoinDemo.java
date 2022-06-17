package threadd;

/**
 * @Author tututyl
 * @Date 2021-12-22
 */

/**
 * 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
 *
 * @author RJH
 * 2017年11月24日
 */
public class JoinDemo {

    public static void main(String[] args) {
        //初始化线程t1,由于后续有匿名内部类调用这个对象,需要用final修饰
        final Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().interrupt();
                for (int i = 0; i < 10000; i++) {
                    System.out.println("t1 is running");
                }
            }
        });
        //初始化线程t2,由于后续有匿名内部类调用这个对象,需要用final修饰
        final Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    t1.join();
                    for (int j = 0; j < 10000; j++) {
                        System.out.println("t2 is running");
                    }
                    //t1调用join方法,t2会等待t1运行完之后才会开始执行后续代码
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("t2 is end");
                }
            }
        });
        //初始化线程t3
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    t2.join();
                    //t2调用join方法,t3会等待t2运行完之后才会开始执行后续代码
                    for (int k = 0; k < 10000; k++) {
                        System.out.println("t3 is running");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("t3 is end");
                }
            }
        });
        //依次启动3个线程
        t1.start();
        t2.start();
        t3.start();
    }
}
