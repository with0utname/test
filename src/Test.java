import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author tututyl
 * @Date 2022-03-04
 */
public class Test {
    public static void main(String[] args) {
        int i=1;
        int count = 0;
        while (true){
            count+=i++;
            if (count>1000000) break;
        }
        System.out.println(i);
    }
}
