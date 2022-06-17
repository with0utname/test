package extend;

/**
 * @Author tututyl
 * @Date 2022-05-11
 */
public class FatherC extends FatherB{
    String b = "b3";

    @Override
    public void hello() {
        System.out.println("hello c"+this.b);
    }

    public static void main(String[] args) {
        FatherA fatherC = new FatherC();
        fatherC.hello();
    }
}
