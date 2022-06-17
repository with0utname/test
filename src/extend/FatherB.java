package extend;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public class FatherB extends FatherA {
    String a = "b";
    String b = "b2";

    static {
        System.out.println("b static");
    }

    {
        System.out.println("b");
    }

    public FatherB() {
        System.out.println("b bron");
    }

//    private void hello(){
//        System.out.println("hello,B");
//    }

    public void hello() {
        super.hello();
        System.out.println("hello b" + this.b);
    }

    public void test() throws NullPointerException {
        FatherB b = null;
        b.test1();
        System.out.println("test end");
    }

    public synchronized void t1() {
        System.out.println("syn B");
        super.t1();
    }

    public void test1() {
//        try {
//            this.test();
//        }catch (NullPointerException e){
//            System.out.println("空指针");
//        }catch (Exception e){
//            System.out.println("异常");
//        }
//        System.out.println("tes1end");
        System.out.println("B.test");
    }

    public static void main(String[] args) {
        FatherB b1 = new FatherB();
//        b1 = new FatherB();
        b1.hello();
        System.out.println(b1.a);
        System.out.println(b1.getClass());
        System.out.println("================");
        FatherB b2 = (FatherB) b1;
        System.out.println(b2.getClass());
        b2.hello();
        System.out.println(b2.a);
        System.out.println("================");
        FatherA b3 = (FatherA) b2;
        System.out.println(b3.getClass());
        b3.hello();
        System.out.println(b3.a);


        FatherA a = new FatherA();
        FatherB b = new FatherB();
        a.t2();
        b.t2();
    }
}
