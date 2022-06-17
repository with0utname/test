import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author tututyl
 * @Date 2022-01-13
 */
public class Singlon {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> map = Class.forName("java.util.concurrent.ConcurrentHashMap");
        Object a =  map.newInstance();
//        a.put("1","2");
        System.out.println();
    }
}
