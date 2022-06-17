package interfacee;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public abstract interface InterfaceA{
    public final static String a = "a";
    public final static int b = 1;

    void sayHi();

    default void sayHello() {
//        InterfaceFather.super.sayHello();
        System.out.println("hello a");
    }

    default void sayWa() {
        System.out.println("hello a");
    }

    public static void jj() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        InterfaceA.jj();
    }
}
