 
package exception;
 
public class ExceptionWithArray {
   public static void main(String[] args){
      try {
         int arr[] = new int [5];
         arr[5] = 11;
      }
      catch(Exception e ){
            System.out.println("Array Exception");
      }
   }
}
