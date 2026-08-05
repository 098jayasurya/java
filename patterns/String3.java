package patterns;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your password");
        String passWord = scn.nextLine();
        if(passWord.length() < 8 || passWord.length() > 16)
            System.out.println("password length must be in between 8 and 16");
        
    }
}

