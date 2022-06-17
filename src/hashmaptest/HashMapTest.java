package hashmaptest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author tututyl
 * @Date 2021-12-17
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<Object,String>();
        hashMap.put(null,"hello");
        System.out.println(hashMap.get(null)); //输出hello

        Hashtable hashtable = new Hashtable();
//        hashtable.put(null,"hello");
//        System.out.println(hashtable.get(null));

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(null,"hello");
        System.out.println(concurrentHashMap.get(null));


        int a = 126^232;

    }
}
