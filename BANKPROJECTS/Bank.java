
import java.util.Scanner;

public class Bank {
    static {
        System.out.println("bank is sb is executed");
        System.out.println("bank is loaded");
    } 
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("bank execution is started");

        Scanner scn = new Scanner(System.in);

        while (true) { 
        System.out.println("\n=====================================================================================\n");
        System.out.println("\t welcome to"+ BankAccount.getBankName() +" bank");
        System.out.println("\tpress any key to continue");
        System.out.println("\n===========================================================================================\n");
        scn.nextLine();
        BankAccount acc = null;

        loop : while (true) { 
            System.out.println("\nchoose one option");
            System.out.println("1.open account");
            System.out.println("2.Account details");
            System.out.println("3.Deposit");
            System.out.println("4.WithDraw");
            System.out.println("5.Balance Enquiry");
            System.out.println("6.transfer amount");
            System.out.println("7. Exit");

            System.out.println("Enter one option");
            int option = scn.nextInt();scn.nextLine();

            switch(option){
                case 1 :
                    acc = new BankAccount();
                    System.out.println("enter details");
                    System.out.println("enter account number");
                    acc.setAccNum(scn.nextLong());scn.nextLine();
                    System.out.println("enter account holder name");
                    acc.setAccHName(scn.nextLine());
                    System.out.println("enter balance");
                    acc.setBalance(scn.nextDouble());scn.nextLine();
                    System.out.println("-----------------------");
                    System.out.println("account is created");
                    System.out.println("----------------------");
                    Thread.sleep(2000);
                    break;

                    case 2:
                        if(acc != null){
                            System.out.println("your account details");
                            acc.display();
                        }else 
                            System.out.println("please open a account first");

                        Thread.sleep(5000);
                        break; 
                        
                    case 3://deposit
                        if(acc != null){
                            System.out.println("enter amount");
                            double amt = scn.nextDouble();scn.nextLine();
                            acc.deposit(amt);

                            System.out.println(amt +"has been credited to  your account");
                            acc.currentBalance();

                        }   else
                            System.out.println("please create account first"); 

                            Thread.sleep(3000);
                            break;

                        case 4:
                            //withdraw
                            if(acc != null){

                                System.out.println("enter withdraw amt");
                                double amt = scn.nextDouble();scn.nextLine();
                                
                                if(acc.getBalance()>amt){
                                    acc.withdraw(amt);
                                }else{
                                    System.out.println("insufficient funds");
                                    break;}
                                System.out.println(amt+"has been withdrawed from your account");
                                acc.currentBalance();
                                }else 
                                System.out.println("please create account first");   
                                Thread.sleep(3000);
                                break;

                        case 5://bank enquiry 
                        if(acc !=  null){
                            System.out.println("current balance");
                            acc.currentBalance();
                        }else 
                            System.out.println("please create account first");
                            
                            Thread.sleep(3000);
                            break;

                        case 6 : //transfer
                        if(acc != null){
                            BankAccount acc2 = new BankAccount(5678,"amazon",10000);

                            System.out.println("enter amount to transfer");
                            double amt = scn.nextDouble();scn.nextLine();
                            acc.transfer(acc2, amt);
                            System.out.println(amt + "is transfered to amazon");

                            System.out.println("your current balance");
                            acc.currentBalance();
                            System.out.println("amazon current balance");
                            acc2.currentBalance();
                        }else 
                            System.out.println("please open account first");

                            Thread.sleep(3000);
                            break;
                        
                        case 7 :
                            System.out.println("thank you visit again");
                            
                            Thread.sleep(3000);
                            break loop;
                        default:
                            System.out.println("Error : invalid option");    
                    
            }//switch1
        }//loop
    }//while1
        }//main
    }

