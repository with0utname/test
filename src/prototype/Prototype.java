package prototype;

public class Prototype {
    String name;

    public Prototype() {

    }

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new Prototype(name);
    }

    public boolean equals(Prototype prototype) {
        return this.name.equals(prototype.getName());
    }

    public static void main(String[] args) {
        Prototype p1 = new Prototype();
        p1.setName("p1");
        Prototype p2 = null;

        p2 = p1.clone();

        System.out.println("验证equals和clone");
        p2.setName("p1");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println("=========分割线=======");
        System.out.println("验证是不是同一个对象:");
        p2.setName("p2");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println("=========分割线=======");
        System.out.println("验证equals和clone");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
