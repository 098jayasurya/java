package setget;

public class college {
    public static void main(String[] args) {
        student s1 = new student();

        s1.setSno(1);
        s1.setSname("jaya");
        System.out.println(s1.getSno());
        System.out.println(s1.getSname());
    }
}
