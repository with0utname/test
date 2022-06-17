package interfacee;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public interface InterfaceB{
    final static String a = "b";
    default void sayHello(){
        System.out.println("hello b");
    }
}
