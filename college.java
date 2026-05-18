import java.util.Scanner;

public class college {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        usingScan s1 = new usingScan();

        System.out.println("Enter your name:");
        s1.sname = scn.nextLine();
        System.out.println("Enter your course fee");
        s1.sfee = scn.nextInt();
        System.out.println("Enter your course fee");
        System.out.println("enter your course");
        s1.scourse = scn.nextLine(); scn.nextLine();
        System.out.println("enter your phone number");
        s1.phone_number = scn.nextInt();
        
        System.out.println(s1.sname);
        System.out.println(s1.sfee);
        System.out.println(s1.scourse);
        System.out.println(s1.phone_number);
    }
}
