package expressions;

public class arthmetic {
    public static void main(String[] args) {
        System.out.println(10  + 2);
        System.out.println(10-2);
        System.out.println(10*2);
        System.out.println(10/2);
        System.out.println(10%2);

        int i1 = 10 + 20;
        int i2 = i1 + (10+15);
        System.out.println(10 + 20);

        int i3 = 10 + 20;
        int i4 = i3 + 20;
        int i6 = i3 + (i4 = 30);

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i6);
    }
}
