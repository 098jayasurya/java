package calproject;
import java.util.Scanner;
public class calcultor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your f no :");
        int a = scn.nextInt();
        System.out.println("Enter your s no");
        int b = scn.nextInt();

        Additon.add(a,b);
    }
}
