package conditinals;
import java.util.Scanner;
public class swi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your day number");
        int num = scn.nextInt();

        switch(num){
            case 1 :
                System.out.println("today is sunday");
                break;
            case 2 :
                System.out.println("today is monday");
                break;
            case 3 :
                System.out.println("today is tuesday");
                break;
            case 4 :
                System.out.println("today is wednesday");
                break;   
            case 5 :
                System.out.println("today is thursday");
                break; 
            case 6 :
                System.out.println("today is friday");
                break; 
            case 7:
                System.out.println("today is saturday");
                break;      
            default: System.out.println("invalid day number,enter only in bw[1-7]");    
        }
    }
}

