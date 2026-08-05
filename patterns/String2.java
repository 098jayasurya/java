package patterns;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name");
        String Name = scn.nextLine();

        System.out.println(Name.length());
    }
}
