package bankbasic;
import java.util.Scanner;
public class BankBasic {

    private double balance;
    public BankBasic(double balance){
        this.balance = balance;
    }
    public void add(double amount){
        System.out.println("\n" + amount + " added to account");
        this.balance += amount;
    }
    public void withdraw(double amount){
        System.out.println("\n" + amount + " withdrawn from account");
        this.balance -= amount;
    }
    public void getBalance(){
         System.out.println("\nBalance: " + this.balance);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter account number: ");
//        int id = in.nextInt();
//        System.out.print("Enter PIN number: ");
//        int pin = in.nextInt();
        boolean active = true;
        System.out.print("Input current balance: ");
        double currentBalance = in.nextDouble();
        BankBasic acc1 = new BankBasic(currentBalance);
        while(active){
            System.out.print("\nPlease input the desired action"
                    + "\n1: Add to Account"
                    + "\n2: Withdraw from Account"
                    + "\n3: Check Balance"
                    + "\n4: Exit\n");
            switch(in.nextInt()){
                case 1:{
                    System.out.print("Input add amount: ");
                    acc1.add(in.nextDouble());
                    break;
                }
                case 2:{
                    System.out.print("Input withdraw amount: ");
                    acc1.withdraw(in.nextDouble());
                    break;
                }
                case 3:{
                    acc1.getBalance();
                    break;
                }
                case 4:{
                    active = false;
                    System.out.println("Thank you.");
                    break;                   
                }
                default:{
                    System.out.println("Invalid input");
                }                    
            }
        }
        
    }
    
}
