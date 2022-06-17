package interfacee;

/**
 * @Author tututyl
 * @Date 2022-05-11
 */
public interface InterfaceFather {
    default void sayHello(){
        System.out.println("hello,father");
    }
}
