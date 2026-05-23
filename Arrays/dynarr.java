package Arrays;
import java.util.Arrays;
import java.util.Scanner;



public class dynarr {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("how many values you want to store ?");
    int num = scn.nextInt();
    int[] ia = new int[num];
    System.out.println("Array with default values" + Arrays.toString(ia));
    for(int i = 0;i<num;i++){
        System.out.println("enter"+ (i + 1) + "number");
        ia[i] = scn.nextInt();
    }
    System.out.println("Array with  values" + Arrays.toString(ia));
    }
}
