package conditinals;
import java.util.Scanner;
enum Tiffin{
    IDLY,DOSA,PURI
}
public class switchenum {
    static void displayprice(Tiffin food){
        switch(food){
            case IDLY :
                System.out.println(food + " price is 20");
                break;
            case DOSA :
                System.out.println(food +"price is 30");
                break;
            case PURI :
                System.out.println(food +"price is 40");        
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("idly");
        System.out.println("dosa");
        System.out.println("puri");

        System.out.println("what do you want");
        System.out.println("enter number");
        int num = scn.nextInt();

        switch(num){
            case 1 :
                displayprice(Tiffin.IDLY);
                break;
            case 2 :
                displayprice(Tiffin.DOSA);
                break;  
            case 3:
                displayprice(Tiffin.PURI);
                break;
            default:
                System.out.println("invalid enter b/w 1-3");        
        }

    }
}
