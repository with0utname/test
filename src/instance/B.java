package instance;

/**
 * @Author tututyl
 * @Date 2022-05-07
 */
public class B extends A{
    public static void main(String[] args) {
        System.out.println(new B() instanceof A);
        System.out.println(new A() instanceof B);
    }
}
