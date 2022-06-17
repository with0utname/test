package exception;

/**
 * @Author tututyl
 * @Date 2022-05-26
 */
public class TestException {
    public static void main(String[] args) {
        System.out.println(testTryCatch1());
    }
    public static int testTryCatch1() {
        int result = 0;
        try {
            result = 1;
            return result+1;
        } catch (Exception e) {
            return result;
        } finally {
            return result;
        }
    }//返回1
}
