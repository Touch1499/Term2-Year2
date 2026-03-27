 
package exception;

import java.util.Scanner;
class InsufficientBalanceException extends Exception {
   InsufficientBalanceException(String message){
      super(message);
   }   
}
class B_Account {
   double balance;
   B_Account(double balance){
      this.balance = balance;
   }
   void deposit(double amount){
      balance = balance + amount;
      System.out.println("Deposit Successful");
      System.out.println("Balance = "+ balance);
   }
   void withdraw(double amount) throws InsufficientBalanceException {
      if(amount > balance){
         throw new InsufficientBalanceException("Insufficient Balance");
      }
      balance = balance - amount;
      System.out.println("Withdraw Successful");
      System.out.println("Balance = "+ balance);
   }
   void checkBalance(){
      System.out.println("Current Balance = " + balance);
   }
}
public class BankSystem {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      B_Account acc = new B_Account(1200);
      int choice;
      do{
         System.out.println("\n---Bank Menu---");
         System.out.println("1 Deposit");
         System.out.println("2 Withdraw");
         System.out.println("3 Check Balance");
         System.out.println("4 Exit");
         
         System.out.println("Enter choice: ");
         choice = sc.nextInt();
         switch(choice){
            case 1:
                  System.out.println("Enter Deposit amount:");
                  double d = sc.nextDouble();
                  acc.deposit(d);
                  break;
            case 2:
                  System.out.println("Enter withdraw amount:");
                  double w = sc.nextDouble();
                  try {
                        acc.withdraw(w);
                  }
                  catch(InsufficientBalanceException e){
                     System.out.println(e.getMessage());
                  }
                  break;
            case 3:
                  acc.checkBalance();
                  break;
            case 4:
                  System.out.println("Thank you for using bank system");
                  break;
            default:
                  System.out.println("Invalid choice");
         }
      }while(choice !=4);
   }  
}
