 
package exception;
 
public class ExceptionWithString {
   public static void main(String[] args){
      try {
         String s = null;
         System.out.println(s.toUpperCase());
      }
      catch(Exception e ){
         System.out.println("String Exception");
      }
   }
}
