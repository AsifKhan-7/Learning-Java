import java.util.*;

public class JavaBasics {

     public static int calculateSum(int num1, int num2 ) {
     
       int sum = num1 + num2;
       return sum;

     } 


    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
         System.out.println("a = " + a);
         System.out.println("b = " + b);

     

    }












  public static void main(String[]args) {
      
       Scanner input = new Scanner(System.in);

      //  System.out.print("Please, enter a number: ");
      //  int a = input.nextInt();
      //  System.out.print("Enter a number again: ");
      //  int b = input.nextInt();

      //  int result = calculateSum(a, b);
      //  System.out.println("Sum of " + a + ","  + b + ": " + result);


          // swap- value exchange 

          int a = 5;
          int b = 10;
          swap(a, b);
           System.out.println("a = " + a);
           System.out.println("b = " + b);
     
  }

    
}