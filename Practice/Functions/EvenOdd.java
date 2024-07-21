import java.util.*;

public class EvenOdd {
  public static boolean isEven(int number) {

    if(number % 2 == 0) {
     return true;
    } 
    else {
     return false;
    }
    
  }
  public static void main(String[]args) {
      Scanner input = new Scanner(System.in);
      int num;

        System.out.println("Program to check the number is even or odd\n");
        System.out.print("Please, enter the number: ");
        num = input.nextInt();
        if(isEven(num)){
          System.out.println("Number is Even");
        }
        else {
          System.out.println("Number is Odd");
        }
   
        input.close();
  }
}