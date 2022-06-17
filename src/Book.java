import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Book {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("开始游戏");
        Book a = null;
        try{
            System.out.println(a.getName());
        }catch (NullPointerException e){
            System.out.println("kong");
        }catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("结束游戏");

        Map d = new HashMap<>();
        d.put("hello",1);
        d.put("a",2);
    }
}
