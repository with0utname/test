package enums;

/**
 * @Author tututyl
 * @Date 2022-05-20
 */
public enum EnumsTest {
    APPLE("RED", "TREE"),
    ORANGE("YELLOW", "TREE"),
    PIPE("PURPLE", "TREE", true);

    String color;
    String birth;

    EnumsTest(String color, String birth) {
        this.color = color;
        this.birth = birth;
    }

    EnumsTest(String color, String birth, Boolean isTree) {
        this.color = color;
        if (isTree) {
            this.birth = birth + "is";
        } else {
            this.birth = birth;
        }
    }

    @Override
    public String toString() {
        return "EnumsTest{" +
                "color='" + color + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(EnumsTest.PIPE);
        System.out.println("hello");
    }
}
