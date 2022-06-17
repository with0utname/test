package exception;

/**
 * @Author tututyl
 * @Date 2022-05-24
 */

public class ExcePojo {
    int a;

    public  void setA(int a) {
        this.a = a;
    }

    public  int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "a==" + a;
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static ExcePojo getInt() {
        ExcePojo a = new ExcePojo();
        System.out.println(a);
        a.setA(10);
        try {
            System.out.println(a.getA() / 0);
            a.setA(20);
            System.out.println(a);
        } catch (ArithmeticException e) {
            a.setA(30);
            System.out.println(a);
            return a;
            /*
             * return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30
             */
        } finally {
            a.setA(40);
            System.out.println(a);
        }
        return a;
    }
}
