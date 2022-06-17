package exception;

/**
 * @Author tututyl
 * @Date 2022-05-24
 */
/*
 * java面试题--如果catch里面有return语句，finally里面的代码还会执行吗？
 */
public class Exce {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        System.out.println(a);
        try {
            System.out.println(a / 0);
            a = 20;
            System.out.println(a);
        } catch (ArithmeticException e) {
            a = 30;
            System.out.println(a);
            return a;
            /*
             * return a 在程序执行到这一步的时候，这里不是return a 而是 return 30；这个返回路径就形成了
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的路径,继续走return 30，形成返回路径之后，这里的a就不是a变量了，而是常量30
             */
        } finally {
            a = 40;
            System.out.println(a);
        }
        return a;
    }
}
