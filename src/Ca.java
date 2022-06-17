/**
 * @Author tututyl
 * @Date 2022-03-10
 */
public class Ca {
    public static void main(String[] args) {
            System.out.println("============位运算===========");
            System.out.println(-1>>> 2);
            System.out.println(1>>> 2);
            System.out.println(-1>> 2);
            System.out.println(1>> 2);
            System.out.println("============位运算===========");
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MIN_VALUE>>1);
            System.out.println(Integer.MIN_VALUE>>>1);
            System.out.println("============结论：就是1，>>>为全部（包括符号位）逻辑右移，循环的 >>为算术右移（不包括符号位）   两个都是左边补0===========");

            String str = "a,b,c, ,'',,";
            String[] ary = str.split(",");
            System.out.println(ary.length);
            for (String s : ary) {
                System.out.println(s);
            }
    }
}
