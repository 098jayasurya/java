package Exception;
import java.util.Scanner;

public class TestThrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Example e1 = new Example();

        try {
            System.out.println("enter num");
            int x=scn.nextInt();
            e1.m1(x);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
