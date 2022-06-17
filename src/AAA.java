/**
 * @Author tututyl
 * @Date 2021-11-26
 */
public class AAA {
    public static void main(String[] args) {
        String event_type = "302";
        if ("300".equals(event_type) || "301".equals(event_type) || "303".equals(event_type) || "311".equals(event_type) || "312".equals(event_type) || "300101".equals(event_type) || "333102".equals(event_type)) {
            System.out.println("丢弃");
        } else {
            if (!"101".equals(event_type) && !"200".equals(event_type) && !"302".equals(event_type)) {
                //需要留意一下其他解冻消息，凡是这里接受的解冻消息，都要加到上面300，301那行
                System.out.println("其他消息类型:" + event_type);
            }
            System.out.println("接受");
        }
    }
}
