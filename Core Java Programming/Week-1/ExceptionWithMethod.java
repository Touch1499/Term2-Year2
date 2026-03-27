 
package exception;

 
public class ExceptionWithMethod {
   static void check(){
      try {
         int a = 5 / 0;
      }
      catch(Exception e ){
         System.out.println("Error in Method ");
      }
   }
   public static void main(String[] args ){
      check();
   }
}
