package interfacee;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public class TestInterfaceInherit implements InterfaceAA,InterfaceB{

    static MyInterInner myInterInner;
    @Override
    public void sayHi() {
        myInterInner=new MyInterInner();
    }

    @Override
    public void sayHello() {
        InterfaceAA.super.sayHello();
    }


    public static void testStatic(){
        System.out.println("static void");
    }

    public static class MyInterInner implements InterfaceC{

        @Override
        public void sayHi() {

        }


    }
    public static void main(String[] args) {
        TestInterfaceInherit testInterfaceInherit = new TestInterfaceInherit();
        testInterfaceInherit.sayHello();

        TestInterfaceInherit.testStatic();

        testInterfaceInherit.sayHi();
        System.out.println("实例前hashcode："+ myInterInner.hashCode());

        MyInterInner myInterInner = new MyInterInner();
        System.out.println("实例后hashcode："+ TestInterfaceInherit.myInterInner.hashCode());
        System.out.println("实例后hashcode："+ myInterInner.hashCode());

        myInterInner.sayHello();

    }

}
