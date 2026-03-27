 
package exception;
class BankAccount {
   double balance = 1200;
   void withdraw(double amount){
      try {
         if(amount > balance )
            throw new ArithmeticException("Insufficient Balance");
      
         balance = balance - amount;
         System.out.println("Withdraw Successful");
         System.out.println("Remaining Balance = " + balance );
      }
      catch(ArithmeticException e ){
         System.out.println("Exception: "+e.getMessage());
      }
   }
}
public class BankDemo {
   public static void main(String[] args){
      BankAccount b = new BankAccount();
      
      b.withdraw(700);
      b.withdraw(800);      
   }
}
