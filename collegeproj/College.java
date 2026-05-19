package collegeproj;
import java.util.Scanner;
public class College {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        student s1 = new student();

        System.out.println("Enter your roll   number");
        s1.sno = scn.nextInt();scn.nextLine();
        System.out.println("enter your name :");
        s1.sname = scn.nextLine();
        System.out.println("enter your fee");
        s1.sfee = scn.nextDouble();scn.nextLine();
        System.out.println("enter your course name");
        s1.scourse = scn.nextLine();
        System.err.println("enter your phone num");
        s1.sphonenum =scn.nextLong();

    }
}
