package patterns;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("how manny students u want to save");
        int noofstudents = scn.nextInt();scn.nextLine();
        String[] student = new String[noofstudents];
        for(int i = 0;i<noofstudents;i++){
            System.out.println("enter student name");
            student[i] = scn.nextLine();
        }
        for(String s : student){
            System.out.println(s);
        }
    }
}
