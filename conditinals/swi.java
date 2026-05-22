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
        
	// 	dayName(Integer.parseInt(args[0]));
	// }

	// static void dayName(int day) {
	// 	switch(day){

	// 		case 1:
	// 			System.out.println("Today is MON");
	// 			break;
				
	// 		case 2:
	// 			System.out.println("Today is TUE");
	// 			break;

	// 		case 3: 
	// 			System.out.println("Today is WED");
	// 			break;	

	// 		case 4:
	// 			System.out.println("Today is THU");
	// 			break;

	// 		case 5:
	// 			System.out.println("Today is FRI");
	// 			break;
				
	// 		case 6:
	// 			System.out.println("Today is SAT");
	// 			break;

	// 		case 7: 
	// 			System.out.println("Today is SUN");
	// 			break;

	// 		default: 
	// 			System.out.println("Invalid number");
	// 			System.out.println("Enter between (1-7) only");
	
	// 	}//switch clo
    }
}

