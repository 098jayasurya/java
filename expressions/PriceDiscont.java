package expressions;

import java.util.Scanner;

public class PriceDiscont {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter product price");
        double price = scn.nextDouble();
        System.out.println("Enter discout price");
        double discount = scn.nextDouble();

        double finalPrice = price - (price * discount/100);

        System.out.println("\n original price\t :" + price);
        System.out.println("Discount %t : " + discount);
        System.out.println("FinalPrice " + finalPrice);

    }
}
