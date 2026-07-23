package Exception;

public class Test11 {
    public static void main(String[] args) {
        System.out.println("before outer try");

        try {
            System.out.println("in outer try");
            System.out.println(10/0);
        } catch (ArithmeticException e) {
        }
    }
}
