
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import setget.bankAccount;


public class BankAccount{
    private static String bankName;
    private static String branchName;
    private static String ifsc;

    private long accNum;
    private String accHName;
    private double balance;

    static  {
        System.out.println("Bank account is loaded");
        System.out.println("bankaccount is started");

        Scanner scn = new Scanner(System.in);
        System.out.println("enter bank name:");
        bankName = scn.nextLine();
        System.out.println("enter branchname");
        branchName=scn.nextLine();
        System.out.println("enter ifsc code");
        ifsc = scn.nextLine();

        System.out.println("sb is ended");
        System.out.println("static fields are intialised");


        
    }
    // try{
    //     BufferedReader br = new BufferedReader(new FileReader("bankdetails.txt"));

    //     bankName=br.readLine();
    //     branchName=br.readLine();
    //     ifsc=br.readLine();
    // }catch(FileNotFoundException e){
    //     System.out.println(e.getMessage());
    // }catch(IOException e){
    //     e.printStackTrace();
    // }
    public BankAccount(){

    }
    public BankAccount(long accNum,String accHName,double balance){
        this.accNum = accNum;
        this.accHName = accHName;
        this.balance = balance;
        System.out.println("3PC is executed");
        System.out.println("instance fields are executed");
    }

    public static void  setBankName(String bankName){
        BankAccount.bankName=bankName;
    }

    public static String getBankName(){
        return BankAccount.bankName;
    }

    public static void setBranchName(String branchNAme){
        BankAccount.branchName=branchNAme;
    }

    public static String getBranchName(){
        return BankAccount.branchName;
    }

    public static void setIfsc(String ifsc){
        BankAccount.ifsc=ifsc;
    }

    public static String getIfsc(){
        return BankAccount.ifsc;
    }

    public void setAccNum(long accNum){
        this.accNum = accNum;
    }    

    public long getAccNum(){
        return this.accNum;
    }

    public void setAccHName(String accHNAme){
        this.accHName =  accHNAme;
    }
    public String getAccHNam(){
        return this.accHName;

    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amt){
        this.balance=balance+amt;
    }

    public void withdraw(double amt){
        this.balance=balance-amt;
    }

    public void currentBalance(){
        System.out.println(balance);
    }

    public void transfer(BankAccount destacc,double amt){
        this.withdraw(amt);
        destacc.deposit(amt);
    }
    public void display(){
		System.out.println("  bankName\t: "			+ bankName);
		System.out.println("  branchName\t: "		+ branchName);
		System.out.println("  ifsc\t\t: "			+ ifsc);
		System.out.println("  accNum\t: "			+ accNum);
		System.out.println("  accHName\t: "			+ accHName);
		System.out.println("  balance\t: "			+ balance);
	}
}