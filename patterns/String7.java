package patterns;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter username");
        String Username = scn.nextLine();
        System.out.println("enter password");
        String Password = scn.nextLine();
        if(Username.equals("GabbarSingh") &&
    Password.equals("PawanKalyan")){
        System.out.println("success");
    }else
        System.out.println("invalid password or username");
    }
}
