package interfacee;

/**
 * @Author tututyl
 * @Date 2022-05-10
 */
public class TestInterface implements InterfaceC {
    @Override
    public void sayHi() {

    }

//    @Override
//    public void sayHello() {
//        System.out.println(InterfaceC.b);
//        InterfaceC.super.sayWa();
//    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.sayHello();
    }
}
