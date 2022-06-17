package abstarct;

/**
 * @Author tututyl
 * @Date 2022-05-07
 */
public class TestB extends TestA {
    public static void main(String[] args) {
        new TestB().SayHi();
        TestB.SayHello();
        System.out.println(new TestB() instanceof TestA);
    }

    @Override
    public void SayHi() {
        System.out.println("hi");
    }
}
