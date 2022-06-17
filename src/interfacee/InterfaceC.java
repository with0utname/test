package interfacee;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public interface InterfaceC extends InterfaceA,InterfaceB{

    @Override
    default void sayHello() {
        InterfaceA.super.sayHello();
        InterfaceB.super.sayHello();
        System.out.println("hello C");
    }
}
