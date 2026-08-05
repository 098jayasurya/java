package patterns;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your mobile number :");
        String Number = scn.nextLine();
        if(Number.length() == 10 && !Number.matches(".*[a-zA-Z].*")){
            System.out.println("Activation code has been sent to your mobile");
        }else
            System.out.println("mobile number should contain 10 digits only");
    }
}
