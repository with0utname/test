package threadd;

/**
 * @Author tututyl
 * @Date 2022-01-19
 */
public class CurrentConList {
    volatile static Integer a=1;
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread1 m2 = new MyThread1();
        m1.start();
        m2.start();
    }

    public static class MyThread extends Thread{
        @Override
        public void run() {
            while (a<10){
                System.out.println(a+"thread11:"+Thread.currentThread().getId());
                
            }
            System.out.println(a+"thread12:"+Thread.currentThread().getId());
        }
    }
    public static class MyThread1 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println(a+"thread13:"+Thread.currentThread().getId());
                synchronized (a){
                    a++;
                }
                try {
                    this.wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                try {
//                    Thread.sleep(0);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(a+"thread14:"+Thread.currentThread().getId());
            }
        }
    }
}
