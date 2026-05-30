package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterOffice {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter your age:");

                int age = scn.nextInt();

                if (age < 18) {
                    throw new IllegalArgumentException(
                            "You are not eligible to vote");
                }

                voter v1 = new voter();
                v1.setAge(age);

                System.out.println("Voter registered successfully");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Please enter only an integer value.");
                scn.nextLine(); // clear invalid input

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scn.close();
    }
}