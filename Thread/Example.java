package Thread;

import java.util.Scanner;

public class Example {
    public static void m1(){
        System.out.println("m1 execution started");
        System.out.println("m1 execution is ended");
    }

    public static void m2(){
        System.out.println("\nm2 is execution start");
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scn.nextLine();

        System.out.println("m2 is excuted");


    }
    public static void m3() {
		System.out.println("\nm3 is execution start");
		System.out.println("m3 is execution end");
	}

    public static void main(String[] args) {
        Thread th1 = new Thread();

        th1.start();

        System.out.println("main end");
    }
}
