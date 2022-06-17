package extend;

/**
 * @Author tututyl
 * @Date 2021-12-16
 */
public class FatherA {
    String a = "a";
    String b = "b1";
    static {
        System.out.println("a static");
    }
    {
        System.out.println("a");
    }
    public FatherA(){
        System.out.println("a bron");
    }

    public void hello(){
        System.out.println("hello a"+this.b);
    }

    public synchronized void t1(){
        System.out.println("syn A");
    }

    public synchronized void t2(){
        System.out.println("syn t2");
    }
}
