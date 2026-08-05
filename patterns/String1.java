package patterns;

import java.util.Scanner;


public class String1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Username :");
        String Username = scn.nextLine();
        if(Username.isEmpty())
            System.out.println("Enter user name");
        else
            System.out.println("Welcome to Nit");

    }
}
