import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class AccountDetails {
    String bankName;
    String acNO;
    String Name;
    String add;
    String contactNo;
    String acType;
    String bal="";
    String newBal="";
    long totalBal = 0;
    long totalNewBal = 0;
    long withdrawAmt = 0;

    public void openAccount(){
//        Scanner i = new Scanner(System.in);
        try{
            InputStreamReader a = new InputStreamReader(System.in);
            BufferedReader i = new BufferedReader(a);
            System.out.print("Enter the name : ");
            Name = i.readLine();
            System.out.print("Enter the address : ");
            add = i.readLine();
            System.out.print("Enter your contact no : ");
            contactNo = i.readLine();
            System.out.print("Enter the bank name : ");
            bankName = i.readLine();
            System.out.print("Enter account no : ");
            acNO = i.readLine();
            System.out.print("Enter account type : ");
            acType = i.readLine();
            System.out.print("Please enter your first deposit amount : ");
            bal = i.readLine();
            totalBal = Integer.parseInt(bal);
            System.out.println("\n\n Congratulations! Your account is successfully created.");
        }catch (Exception err){
            System.out.println("Error Occured.....");
            err.printStackTrace();
        }
    }

    public void DepositAmount(){

        try{
//            Scanner s = new Scanner(System.in);
            InputStreamReader a = new InputStreamReader(System.in);
            BufferedReader i = new BufferedReader(a);
            System.out.print("Enter your bank name : ");
            bankName = i.readLine();
            System.out.print("Enter your name : ");
            Name = i.readLine();
            System.out.print("Enter your account number : ");
            acNO = i.readLine();
            System.out.print("Enter account type : ");
            acType = i.readLine();
            System.out.print("Enter deposit amount : ");
            newBal = i.readLine();
            System.out.println("\n\n Your balance is successfully deposited.");
            totalNewBal = Integer.parseInt(newBal);
            totalBal = totalBal + totalNewBal;
            System.out.println("Your new balance is : " + totalBal);
            System.out.println("Thank You for banking with " + bankName);
        }catch (Exception err){
            err.printStackTrace();
        }

    }

    public void WithdrawAmount(){
//        Scanner s = new Scanner(System.in);
        try{
            InputStreamReader a = new InputStreamReader(System.in);
            BufferedReader i = new BufferedReader(a);
            System.out.print("Enter your bank name : ");
            bankName = i.readLine();
            System.out.print("Enter your name : ");
            Name = i.readLine();
            System.out.print("Enter your account number : ");
            acNO = i.readLine();
            System.out.print("Enter account type : ");
            acType = i.readLine();
            System.out.print("Enter withdraw amount : ");
            newBal = i.readLine();
            withdrawAmt = Integer.parseInt(newBal);
        }catch (Exception err){
            err.printStackTrace();
        }

        if(totalBal < withdrawAmt){
            System.out.println("Sorry! Your total balance is low.");
            System.out.println("Please enter less amount.");
        }
        else {
            totalBal = totalBal - withdrawAmt;
            System.out.println("Thanks for banking with " + bankName);
            System.out.println("Your new balance is : " + totalBal);
        }
    }

    public void BalanceEnquiry(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your bank name : ");
        bankName = s.nextLine();
        System.out.print("Enter your name : ");
        Name = s.nextLine();
        System.out.print("Enter your account number : ");
        acNO = s.nextLine();
        System.out.print("Enter account type : ");
        acType = s.nextLine();
        System.out.println("\n Enter balance is : " + totalBal);
        System.out.println("Thanks for visit " + bankName);
    }
    public static void main(String[] str){
        AccountDetails acd = new AccountDetails();
        Scanner t = new Scanner(System.in);
        int ch;
        while (true){
            System.out.print("\n 1. Open an account \n 2. Deposit amount \n 3. Withdraw amount \n 4. Balance Enquiry" +
                    "\n 5. Exit \n\t\t Enter your choice : ");
            ch = t.nextInt();

            switch(ch){
                case 1:
                    acd.openAccount();
                    break;
                case 2:
                    acd.DepositAmount();
                    break;
                case 3:
                    acd.WithdrawAmount();
                    break;
                case 4:
                    acd.BalanceEnquiry();
                    break;
            }
            if(ch >= 5){
                break;
            }
        }
    }
}

