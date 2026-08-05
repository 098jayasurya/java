package patterns;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scn.nextLine();
        if(name.length() == 0)
            System.out.println("name is empty");
        else
            System.out.println("HI" + name);
    }
}
